package vdmpp;

import java.util.*;
import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class MobilePhoneModelTester extends FeatureModelTester {
  private Parent mobilePhone = new Parent("mobile phone");
  private Feature calls = new Feature("calls");
  private Feature gps = new Feature("gps");
  private Parent screen = new Parent("screen");
  private Parent media = new Parent("media");
  private Feature basic = new Feature("basic");
  private Feature colour = new Feature("colour");
  private Feature highResolution = new Feature("high resolution");
  private Feature camera = new Feature("camera");
  private Feature mp3 = new Feature("mp3");

  public Model createModel() {

    media.setParentType(quotes.orParentQuote.getInstance());
    screen.setParentType(quotes.xorParentQuote.getInstance());
    screen.setSubFeatures(SeqUtil.seq(basic, colour, highResolution));
    media.setSubFeatures(SeqUtil.seq(camera, mp3));
    mobilePhone.setSubFeatures(SeqUtil.seq(media, calls, gps, screen));
    gps.setMandatory(false);
    media.setMandatory(false);
    screen.setMandatory(false);
    camera.setRequirements(SeqUtil.seq(highResolution));
    gps.setExclusions(SeqUtil.seq(basic));
    return new Model(mobilePhone);
  }

  public void testModel() {

    Model mobilePhoneModel = createModel();
    testParentType(media, quotes.orParentQuote.getInstance());
    testParentType(screen, quotes.xorParentQuote.getInstance());
    testParentType(mobilePhone, quotes.defaultParentQuote.getInstance());
    testSubFeatures(screen, SeqUtil.seq(basic, colour, highResolution));
    testSubFeatures(media, SeqUtil.seq(camera, mp3));
    testSubFeatures(mobilePhone, SeqUtil.seq(media, calls, gps, screen));
    testMandatoryFeature(mobilePhone, true);
    testMandatoryFeature(calls, true);
    testMandatoryFeature(gps, false);
    testMandatoryFeature(screen, false);
    testMandatoryFeature(media, false);
    testMandatoryFeature(basic, false);
    testMandatoryFeature(colour, false);
    testMandatoryFeature(highResolution, false);
    testMandatoryFeature(camera, false);
    testMandatoryFeature(mp3, false);
    testRequirements(mobilePhone, SeqUtil.seq());
    testRequirements(calls, SeqUtil.seq());
    testRequirements(gps, SeqUtil.seq());
    testRequirements(screen, SeqUtil.seq());
    testRequirements(media, SeqUtil.seq());
    testRequirements(basic, SeqUtil.seq());
    testRequirements(colour, SeqUtil.seq());
    testRequirements(highResolution, SeqUtil.seq());
    testRequirements(camera, SeqUtil.seq(highResolution));
    testRequirements(mp3, SeqUtil.seq());
    testExclusions(mobilePhone, SeqUtil.seq());
    testExclusions(calls, SeqUtil.seq());
    testExclusions(gps, SeqUtil.seq(basic));
    testExclusions(screen, SeqUtil.seq());
    testExclusions(media, SeqUtil.seq());
    testExclusions(basic, SeqUtil.seq());
    testExclusions(colour, SeqUtil.seq());
    testExclusions(highResolution, SeqUtil.seq());
    testExclusions(camera, SeqUtil.seq());
    testExclusions(mp3, SeqUtil.seq());
    testModelRoot(mobilePhoneModel, mobilePhone);
    testModelFeaturesCount(mobilePhoneModel, 10L);
    validModelConfig(
        mobilePhoneModel,
        MapUtil.map(
            new Maplet("mobile phone", true),
            new Maplet("calls", true),
            new Maplet("gps", true),
            new Maplet("screen", true),
            new Maplet("basic", false),
            new Maplet("colour", false),
            new Maplet("high resolution", true),
            new Maplet("media", true),
            new Maplet("camera", true),
            new Maplet("mp3", true)));
    invalidModelConfig(
        mobilePhoneModel,
        MapUtil.map(
            new Maplet("mobile phone", true),
            new Maplet("calls", false),
            new Maplet("gps", true),
            new Maplet("screen", true),
            new Maplet("basic", false),
            new Maplet("colour", false),
            new Maplet("high resolution", true),
            new Maplet("media", true),
            new Maplet("camera", true),
            new Maplet("mp3", true),
            new Maplet("3g", true)));
    testGeneratedValidConfigs(mobilePhoneModel, Utilities.mobilePhoneValidConfigs());
  }

  public MobilePhoneModelTester() {}

  public String toString() {

    return "MobilePhoneModelTester{"
        + "mobilePhone := "
        + Utils.toString(mobilePhone)
        + ", calls := "
        + Utils.toString(calls)
        + ", gps := "
        + Utils.toString(gps)
        + ", screen := "
        + Utils.toString(screen)
        + ", media := "
        + Utils.toString(media)
        + ", basic := "
        + Utils.toString(basic)
        + ", colour := "
        + Utils.toString(colour)
        + ", highResolution := "
        + Utils.toString(highResolution)
        + ", camera := "
        + Utils.toString(camera)
        + ", mp3 := "
        + Utils.toString(mp3)
        + "}";
  }
}
