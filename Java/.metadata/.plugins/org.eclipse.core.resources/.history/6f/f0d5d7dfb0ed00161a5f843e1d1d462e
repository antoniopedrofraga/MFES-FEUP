
import java.util.*;
import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class CarModelTester extends FeatureModelTester {
  private Parent car = new Parent("car");
  private Feature body = new Feature("body");
  private Parent transmission = new Parent("transmission");
  private Feature automatic = new Feature("automatic");
  private Feature manual = new Feature("manual");
  private Parent pullsTrailler = new Parent("pullsTrailler");
  private Parent heavyTrailler = new Parent("heavyTrailler");
  private Feature armor = new Feature("armor");
  private Feature lightTrailler = new Feature("lightTrailler");
  private Parent engine = new Parent("engine");
  private Feature gasoline = new Feature("gasoline");
  private Feature electric = new Feature("electric");

  public Model createModel() {

    Model model = new Model(car);
    pullsTrailler.setParentType(quotes.xorParentQuote.getInstance());
    transmission.setParentType(quotes.xorParentQuote.getInstance());
    engine.setParentType(quotes.orParentQuote.getInstance());
    armor.setMandatory(false);
    pullsTrailler.setMandatory(false);
    lightTrailler.setMandatory(false);
    heavyTrailler.setMandatory(false);
    car.setSubFeatures(SetUtil.set(body, transmission, pullsTrailler, engine));
    transmission.setSubFeatures(SetUtil.set(automatic, manual));
    engine.setSubFeatures(SetUtil.set(gasoline, electric));
    pullsTrailler.setSubFeatures(SetUtil.set(lightTrailler, heavyTrailler));
    heavyTrailler.setSubFeatures(SetUtil.set(armor));
    model.setFeatures();
    return model;
  }

  public void testModel() {

    Model carModel = createModel();
    testParentType(pullsTrailler, quotes.xorParentQuote.getInstance());
    testParentType(transmission, quotes.xorParentQuote.getInstance());
    testParentType(engine, quotes.orParentQuote.getInstance());
    testParentType(car, quotes.defaultParentQuote.getInstance());
    testParentType(heavyTrailler, quotes.defaultParentQuote.getInstance());
    testSubFeatures(car, SetUtil.set(body, transmission, pullsTrailler, engine));
    testSubFeatures(transmission, SetUtil.set(automatic, manual));
    testSubFeatures(engine, SetUtil.set(gasoline, electric));
    testSubFeatures(pullsTrailler, SetUtil.set(lightTrailler, heavyTrailler));
    testSubFeatures(heavyTrailler, SetUtil.set(armor));
    testMandatoryFeature(car, true);
    testMandatoryFeature(body, true);
    testMandatoryFeature(transmission, true);
    testMandatoryFeature(automatic, false);
    testMandatoryFeature(manual, false);
    testMandatoryFeature(pullsTrailler, false);
    testMandatoryFeature(heavyTrailler, false);
    testMandatoryFeature(lightTrailler, false);
    testMandatoryFeature(armor, false);
    testMandatoryFeature(engine, true);
    testMandatoryFeature(gasoline, false);
    testMandatoryFeature(electric, false);
    testRequirements(car, SetUtil.set());
    testRequirements(body, SetUtil.set());
    testRequirements(transmission, SetUtil.set());
    testRequirements(automatic, SetUtil.set());
    testRequirements(manual, SetUtil.set());
    testRequirements(pullsTrailler, SetUtil.set());
    testRequirements(heavyTrailler, SetUtil.set());
    testRequirements(lightTrailler, SetUtil.set());
    testRequirements(armor, SetUtil.set());
    testRequirements(engine, SetUtil.set());
    testRequirements(gasoline, SetUtil.set());
    testRequirements(electric, SetUtil.set());
    testExclusions(car, SetUtil.set());
    testExclusions(body, SetUtil.set());
    testExclusions(transmission, SetUtil.set());
    testExclusions(automatic, SetUtil.set());
    testExclusions(manual, SetUtil.set());
    testExclusions(pullsTrailler, SetUtil.set());
    testExclusions(heavyTrailler, SetUtil.set());
    testExclusions(lightTrailler, SetUtil.set());
    testExclusions(armor, SetUtil.set());
    testExclusions(engine, SetUtil.set());
    testExclusions(gasoline, SetUtil.set());
    testExclusions(electric, SetUtil.set());
    testModelRoot(carModel, car);
    testModelFeaturesCount(carModel, 12L);
    validModelConfig(
        carModel,
        SetUtil.set(
            "armor",
            "automatic",
            "body",
            "car",
            "electric",
            "engine",
            "gasoline",
            "heavyTrailler",
            "pullsTrailler",
            "transmission"));
    invalidModelConfig(carModel, SetUtil.set("car"));
    testGeneratedValidConfigs(carModel, carValidConfigs());
  }

  public CarModelTester() {}

  public static VDMSet carValidConfigs() {

    return SetUtil.set(
        SetUtil.set(
            "armor",
            "automatic",
            "body",
            "car",
            "electric",
            "engine",
            "gasoline",
            "heavyTrailler",
            "pullsTrailler",
            "transmission"),
        SetUtil.set(
            "armor",
            "automatic",
            "body",
            "car",
            "electric",
            "engine",
            "heavyTrailler",
            "pullsTrailler",
            "transmission"),
        SetUtil.set(
            "armor",
            "automatic",
            "body",
            "car",
            "engine",
            "gasoline",
            "heavyTrailler",
            "pullsTrailler",
            "transmission"),
        SetUtil.set(
            "armor",
            "body",
            "car",
            "electric",
            "engine",
            "gasoline",
            "heavyTrailler",
            "manual",
            "pullsTrailler",
            "transmission"),
        SetUtil.set(
            "armor",
            "body",
            "car",
            "electric",
            "engine",
            "heavyTrailler",
            "manual",
            "pullsTrailler",
            "transmission"),
        SetUtil.set(
            "armor",
            "body",
            "car",
            "engine",
            "gasoline",
            "heavyTrailler",
            "manual",
            "pullsTrailler",
            "transmission"),
        SetUtil.set(
            "automatic",
            "body",
            "car",
            "electric",
            "engine",
            "gasoline",
            "heavyTrailler",
            "pullsTrailler",
            "transmission"),
        SetUtil.set(
            "automatic",
            "body",
            "car",
            "electric",
            "engine",
            "gasoline",
            "lightTrailler",
            "pullsTrailler",
            "transmission"),
        SetUtil.set("automatic", "body", "car", "electric", "engine", "gasoline", "transmission"),
        SetUtil.set(
            "automatic",
            "body",
            "car",
            "electric",
            "engine",
            "heavyTrailler",
            "pullsTrailler",
            "transmission"),
        SetUtil.set(
            "automatic",
            "body",
            "car",
            "electric",
            "engine",
            "lightTrailler",
            "pullsTrailler",
            "transmission"),
        SetUtil.set("automatic", "body", "car", "electric", "engine", "transmission"),
        SetUtil.set(
            "automatic",
            "body",
            "car",
            "engine",
            "gasoline",
            "heavyTrailler",
            "pullsTrailler",
            "transmission"),
        SetUtil.set(
            "automatic",
            "body",
            "car",
            "engine",
            "gasoline",
            "lightTrailler",
            "pullsTrailler",
            "transmission"),
        SetUtil.set("automatic", "body", "car", "engine", "gasoline", "transmission"),
        SetUtil.set(
            "body",
            "car",
            "electric",
            "engine",
            "gasoline",
            "heavyTrailler",
            "manual",
            "pullsTrailler",
            "transmission"),
        SetUtil.set(
            "body",
            "car",
            "electric",
            "engine",
            "gasoline",
            "lightTrailler",
            "manual",
            "pullsTrailler",
            "transmission"),
        SetUtil.set("body", "car", "electric", "engine", "gasoline", "manual", "transmission"),
        SetUtil.set(
            "body",
            "car",
            "electric",
            "engine",
            "heavyTrailler",
            "manual",
            "pullsTrailler",
            "transmission"),
        SetUtil.set(
            "body",
            "car",
            "electric",
            "engine",
            "lightTrailler",
            "manual",
            "pullsTrailler",
            "transmission"),
        SetUtil.set("body", "car", "electric", "engine", "manual", "transmission"),
        SetUtil.set(
            "body",
            "car",
            "engine",
            "gasoline",
            "heavyTrailler",
            "manual",
            "pullsTrailler",
            "transmission"),
        SetUtil.set(
            "body",
            "car",
            "engine",
            "gasoline",
            "lightTrailler",
            "manual",
            "pullsTrailler",
            "transmission"),
        SetUtil.set("body", "car", "engine", "gasoline", "manual", "transmission"));
  }

  public String toString() {

    return "CarModelTester{"
        + "car := "
        + Utils.toString(car)
        + ", body := "
        + Utils.toString(body)
        + ", transmission := "
        + Utils.toString(transmission)
        + ", automatic := "
        + Utils.toString(automatic)
        + ", manual := "
        + Utils.toString(manual)
        + ", pullsTrailler := "
        + Utils.toString(pullsTrailler)
        + ", heavyTrailler := "
        + Utils.toString(heavyTrailler)
        + ", armor := "
        + Utils.toString(armor)
        + ", lightTrailler := "
        + Utils.toString(lightTrailler)
        + ", engine := "
        + Utils.toString(engine)
        + ", gasoline := "
        + Utils.toString(gasoline)
        + ", electric := "
        + Utils.toString(electric)
        + "}";
  }
}
