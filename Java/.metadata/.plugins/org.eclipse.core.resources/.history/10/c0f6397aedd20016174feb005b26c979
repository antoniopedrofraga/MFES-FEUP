
import java.util.*;
import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class Parent extends Feature {
  private VDMSet subFeatures = SetUtil.set();
  private Object type = quotes.defaultParentQuote.getInstance();

  public void cg_init_Parent_1(final String n) {

    name = n;
    return;
  }

  public Parent(final String n) {

    cg_init_Parent_1(n);
  }

  public void setParentType(final Object t) {

    type = t;
    Boolean orResult_1 = false;

    if (Utils.equals(t, quotes.orParentQuote.getInstance())) {
      orResult_1 = true;
    } else {
      orResult_1 = Utils.equals(t, quotes.xorParentQuote.getInstance());
    }

    if (orResult_1) {
      setSubFeaturesOptional();
    }
  }

  public Object getParentType() {

    return type;
  }

  public Boolean isXorParent() {

    return Utils.equals(type, quotes.xorParentQuote.getInstance());
  }

  public Boolean isOrParent() {

    return Utils.equals(type, quotes.orParentQuote.getInstance());
  }

  public Boolean isDefaultParent() {

    return Utils.equals(type, quotes.defaultParentQuote.getInstance());
  }

  public void setSubFeatures(final VDMSet s) {

    subFeatures = Utils.copy(s);
    Boolean orResult_2 = false;

    if (Utils.equals(type, quotes.orParentQuote.getInstance())) {
      orResult_2 = true;
    } else {
      orResult_2 = Utils.equals(type, quotes.xorParentQuote.getInstance());
    }

    if (orResult_2) {
      setSubFeaturesOptional();
    }
  }

  public void setSubFeaturesOptional() {

    for (Iterator iterator_30 = subFeatures.iterator(); iterator_30.hasNext(); ) {
      Feature subFeature = (Feature) iterator_30.next();
      subFeature.setMandatory(false);
    }
  }

  public VDMSet getSubFeatures() {

    return Utils.copy(subFeatures);
  }

  public VDMSet getSubFeaturesNames() {

    VDMSet setCompResult_7 = SetUtil.set();
    VDMSet set_7 = Utils.copy(subFeatures);
    for (Iterator iterator_7 = set_7.iterator(); iterator_7.hasNext(); ) {
      Feature el = ((Feature) iterator_7.next());
      setCompResult_7.add(el.getName());
    }
    return Utils.copy(setCompResult_7);
  }

  public VDMSet features() {

    VDMSet parentFeatures = SetUtil.set(name);
    for (Iterator iterator_31 = subFeatures.iterator(); iterator_31.hasNext(); ) {
      Feature subFeature = (Feature) iterator_31.next();
      parentFeatures = SetUtil.union(Utils.copy(parentFeatures), subFeature.features());
    }
    return Utils.copy(parentFeatures);
  }

  public VDMSet invalidSubsets() {

    VDMSet restrictions = getReqAndExcRestrictions();
    for (Iterator iterator_32 = subFeatures.iterator(); iterator_32.hasNext(); ) {
      Feature subFeature = (Feature) iterator_32.next();
      restrictions = SetUtil.union(Utils.copy(restrictions), subFeature.invalidSubsets());
    }
    return Utils.copy(restrictions);
  }

  public Number nodeCount() {

    Number childNodeCount = 1L;
    for (Iterator iterator_33 = subFeatures.iterator(); iterator_33.hasNext(); ) {
      Feature subFeature = (Feature) iterator_33.next();
      childNodeCount = childNodeCount.longValue() + subFeature.nodeCount().longValue();
    }
    return childNodeCount;
  }

  public Boolean isValidConfiguration(final VDMMap c) {

    Number configuredSubFeatures = 0L;
    Boolean andResult_7 = false;

    if (mandatory) {
      if (!(Utilities.isNameConfigured(name, Utils.copy(c)))) {
        andResult_7 = true;
      }
    }

    if (andResult_7) {
      return false;
    }

    for (Iterator iterator_34 = subFeatures.iterator(); iterator_34.hasNext(); ) {
      Feature subFeature = (Feature) iterator_34.next();
      if (Utilities.isNameConfigured(subFeature.name, Utils.copy(c))) {
        configuredSubFeatures = configuredSubFeatures.longValue() + 1L;
      }

      if (!(subFeature.isValidConfiguration(Utils.copy(c)))) {
        return false;
      }
    }
    Boolean andResult_8 = false;

    if (isRespectingReqAndExc(Utils.copy(c))) {
      Boolean andResult_9 = false;

      Boolean andResult_10 = false;

      if (Utils.equals(type, quotes.orParentQuote.getInstance())) {
        if (Utils.equals(configuredSubFeatures, 0L)) {
          andResult_10 = true;
        }
      }

      if (!(andResult_10)) {
        Boolean andResult_11 = false;

        if (Utils.equals(type, quotes.xorParentQuote.getInstance())) {
          if (!(Utils.equals(configuredSubFeatures, 1L))) {
            andResult_11 = true;
          }
        }

        if (!(andResult_11)) {
          andResult_9 = true;
        }
      }

      if (andResult_9) {
        andResult_8 = true;
      }
    }

    return andResult_8;
  }

  public Boolean optionalSubFeatures() {

    if (mandatory) {
      return true;
    }

    for (Iterator iterator_35 = subFeatures.iterator(); iterator_35.hasNext(); ) {
      Feature subFeature = (Feature) iterator_35.next();
      if (!(subFeature.isOptionalSubFeature())) {
        return false;
      }
    }
    return true;
  }

  public Boolean isOptionalSubFeature() {

    for (Iterator iterator_36 = subFeatures.iterator(); iterator_36.hasNext(); ) {
      Feature subFeature = (Feature) iterator_36.next();
      if (!(subFeature.isOptionalSubFeature())) {
        return false;
      }
    }
    if (Utils.equals(mandatory, false)) {
      return true;

    } else {
      return false;
    }
  }

  public Parent() {}

  public static Boolean optionalHasOptionalSubFeatures(final VDMSet subFeatures_1) {

    VDMSet setCompResult_8 = SetUtil.set();
    VDMSet set_8 = Utils.copy(subFeatures_1);
    for (Iterator iterator_8 = set_8.iterator(); iterator_8.hasNext(); ) {
      Feature elem = ((Feature) iterator_8.next());
      setCompResult_8.add(elem.isOptionalSubFeature());
    }
    return !(SetUtil.subset(SetUtil.set(false), setCompResult_8));
  }

  public String toString() {

    return "Parent{"
        + "subFeatures := "
        + Utils.toString(subFeatures)
        + ", type := "
        + Utils.toString(type)
        + "}";
  }
}
