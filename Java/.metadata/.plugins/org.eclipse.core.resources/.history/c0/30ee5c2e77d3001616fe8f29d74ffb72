
import java.util.*;
import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class EshopModelTester extends FeatureModelTester {
  private Parent eshop = new Parent("e-shop");
  private Feature catalogue = new Feature("catalogue");
  private Parent payment = new Parent("payment");
  private Parent security = new Parent("security");
  private Feature search = new Feature("search");
  private Feature bankTransfer = new Feature("bank transfer");
  private Feature creditCard = new Feature("credit card");
  private Feature high = new Feature("high");
  private Feature standard = new Feature("standard");

  public Model createModel() {

    Model model = new Model(eshop);
    payment.setParentType(quotes.orParentQuote.getInstance());
    security.setParentType(quotes.xorParentQuote.getInstance());
    payment.setSubFeatures(SetUtil.set(bankTransfer, creditCard));
    security.setSubFeatures(SetUtil.set(high, standard));
    eshop.setSubFeatures(SetUtil.set(catalogue, payment, security, search));
    search.setMandatory(false);
    creditCard.setRequirements(SetUtil.set(high));
    model.setFeatures();
    return model;
  }

  public void testModel() {

    Model eshopModel = createModel();
    testParentType(payment, quotes.orParentQuote.getInstance());
    testParentType(security, quotes.xorParentQuote.getInstance());
    testParentType(eshop, quotes.defaultParentQuote.getInstance());
    testSubFeatures(payment, SetUtil.set(bankTransfer, creditCard));
    testSubFeatures(security, SetUtil.set(high, standard));
    testSubFeatures(eshop, SetUtil.set(catalogue, payment, security, search));
    testMandatoryFeature(eshop, true);
    testMandatoryFeature(catalogue, true);
    testMandatoryFeature(payment, true);
    testMandatoryFeature(security, true);
    testMandatoryFeature(search, false);
    testMandatoryFeature(bankTransfer, false);
    testMandatoryFeature(creditCard, false);
    testMandatoryFeature(high, false);
    testMandatoryFeature(standard, false);
    testRequirements(eshop, SetUtil.set());
    testRequirements(catalogue, SetUtil.set());
    testRequirements(payment, SetUtil.set());
    testRequirements(security, SetUtil.set());
    testRequirements(search, SetUtil.set());
    testRequirements(bankTransfer, SetUtil.set());
    testRequirements(creditCard, SetUtil.set(high));
    testRequirements(high, SetUtil.set());
    testRequirements(standard, SetUtil.set());
    testExclusions(eshop, SetUtil.set());
    testExclusions(catalogue, SetUtil.set());
    testExclusions(payment, SetUtil.set());
    testExclusions(security, SetUtil.set());
    testExclusions(search, SetUtil.set());
    testExclusions(bankTransfer, SetUtil.set());
    testExclusions(creditCard, SetUtil.set());
    testExclusions(high, SetUtil.set());
    testExclusions(standard, SetUtil.set());
    testModelRoot(eshopModel, eshop);
    testModelFeaturesCount(eshopModel, 9L);
    validModelConfig(
        eshopModel,
        MapUtil.map(
            new Maplet("e-shop", true),
            new Maplet("catalogue", true),
            new Maplet("payment", true),
            new Maplet("bank transfer", true),
            new Maplet("credit card", false),
            new Maplet("security", true),
            new Maplet("high", false),
            new Maplet("standard", true),
            new Maplet("search", false)));
    invalidModelConfig(
        eshopModel,
        MapUtil.map(
            new Maplet("e-shop", true),
            new Maplet("catalogue", true),
            new Maplet("payment", true),
            new Maplet("bank transfer", true),
            new Maplet("credit card", true),
            new Maplet("security", true),
            new Maplet("high", false),
            new Maplet("standard", false),
            new Maplet("search", false)));
    testGeneratedValidConfigs(eshopModel, eshopValidConfigs());
  }

  public EshopModelTester() {}

  public static VDMSet eshopValidConfigs() {

    return SetUtil.set(
        MapUtil.map(
            new Maplet("e-shop", true),
            new Maplet("catalogue", true),
            new Maplet("payment", true),
            new Maplet("bank transfer", false),
            new Maplet("credit card", true),
            new Maplet("security", true),
            new Maplet("high", true),
            new Maplet("standard", false),
            new Maplet("search", false)),
        MapUtil.map(
            new Maplet("e-shop", true),
            new Maplet("catalogue", true),
            new Maplet("payment", true),
            new Maplet("bank transfer", false),
            new Maplet("credit card", true),
            new Maplet("security", true),
            new Maplet("high", true),
            new Maplet("standard", false),
            new Maplet("search", true)),
        MapUtil.map(
            new Maplet("e-shop", true),
            new Maplet("catalogue", true),
            new Maplet("payment", true),
            new Maplet("bank transfer", true),
            new Maplet("credit card", false),
            new Maplet("security", true),
            new Maplet("high", false),
            new Maplet("standard", true),
            new Maplet("search", false)),
        MapUtil.map(
            new Maplet("e-shop", true),
            new Maplet("catalogue", true),
            new Maplet("payment", true),
            new Maplet("bank transfer", true),
            new Maplet("credit card", false),
            new Maplet("security", true),
            new Maplet("high", false),
            new Maplet("standard", true),
            new Maplet("search", true)),
        MapUtil.map(
            new Maplet("e-shop", true),
            new Maplet("catalogue", true),
            new Maplet("payment", true),
            new Maplet("bank transfer", true),
            new Maplet("credit card", false),
            new Maplet("security", true),
            new Maplet("high", true),
            new Maplet("standard", false),
            new Maplet("search", false)),
        MapUtil.map(
            new Maplet("e-shop", true),
            new Maplet("catalogue", true),
            new Maplet("payment", true),
            new Maplet("bank transfer", true),
            new Maplet("credit card", false),
            new Maplet("security", true),
            new Maplet("high", true),
            new Maplet("standard", false),
            new Maplet("search", true)),
        MapUtil.map(
            new Maplet("e-shop", true),
            new Maplet("catalogue", true),
            new Maplet("payment", true),
            new Maplet("bank transfer", true),
            new Maplet("credit card", true),
            new Maplet("security", true),
            new Maplet("high", true),
            new Maplet("standard", false),
            new Maplet("search", false)),
        MapUtil.map(
            new Maplet("e-shop", true),
            new Maplet("catalogue", true),
            new Maplet("payment", true),
            new Maplet("bank transfer", true),
            new Maplet("credit card", true),
            new Maplet("security", true),
            new Maplet("high", true),
            new Maplet("standard", false),
            new Maplet("search", true)));
  }

  public String toString() {

    return "EshopModelTester{"
        + "eshop := "
        + Utils.toString(eshop)
        + ", catalogue := "
        + Utils.toString(catalogue)
        + ", payment := "
        + Utils.toString(payment)
        + ", security := "
        + Utils.toString(security)
        + ", search := "
        + Utils.toString(search)
        + ", bankTransfer := "
        + Utils.toString(bankTransfer)
        + ", creditCard := "
        + Utils.toString(creditCard)
        + ", high := "
        + Utils.toString(high)
        + ", standard := "
        + Utils.toString(standard)
        + "}";
  }
}
