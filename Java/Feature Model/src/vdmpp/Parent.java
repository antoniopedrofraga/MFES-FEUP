package vdmpp;

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
    Boolean orResult_2 = false;

    if (Utils.equals(t, quotes.orParentQuote.getInstance())) {
      orResult_2 = true;
    } else {
      orResult_2 = Utils.equals(t, quotes.xorParentQuote.getInstance());
    }

    if (orResult_2) {
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
    Boolean orResult_3 = false;

    if (Utils.equals(type, quotes.orParentQuote.getInstance())) {
      orResult_3 = true;
    } else {
      orResult_3 = Utils.equals(type, quotes.xorParentQuote.getInstance());
    }

    if (orResult_3) {
      setSubFeaturesOptional();
    }
  }

  public void setSubFeaturesOptional() {

    for (Iterator iterator_22 = subFeatures.iterator(); iterator_22.hasNext(); ) {
      Feature subFeature = (Feature) iterator_22.next();
      subFeature.setMandatory(false);
    }
  }

  public VDMSet getSubFeatures() {

    return Utils.copy(subFeatures);
  }

  public VDMSet getSubFeaturesNames() {

    VDMSet setCompResult_13 = SetUtil.set();
    VDMSet set_18 = Utils.copy(subFeatures);
    for (Iterator iterator_18 = set_18.iterator(); iterator_18.hasNext(); ) {
      Feature el = ((Feature) iterator_18.next());
      setCompResult_13.add(el.getName());
    }
    return Utils.copy(setCompResult_13);
  }

  public VDMSet features() {

    VDMSet parentFeatures = SetUtil.set(name);
    for (Iterator iterator_23 = subFeatures.iterator(); iterator_23.hasNext(); ) {
      Feature subFeature = (Feature) iterator_23.next();
      parentFeatures = SetUtil.union(Utils.copy(parentFeatures), subFeature.features());
    }
    return Utils.copy(parentFeatures);
  }

  public VDMSet invalidSubsets() {

    VDMSet restrictions = getReqAndExcRestrictions();
    for (Iterator iterator_24 = subFeatures.iterator(); iterator_24.hasNext(); ) {
      Feature subFeature = (Feature) iterator_24.next();
      restrictions = SetUtil.union(Utils.copy(restrictions), subFeature.invalidSubsets());
    }
    return Utils.copy(restrictions);
  }

  public Number nodeCount() {

    Number childNodeCount = 1L;
    for (Iterator iterator_25 = subFeatures.iterator(); iterator_25.hasNext(); ) {
      Feature subFeature = (Feature) iterator_25.next();
      childNodeCount = childNodeCount.longValue() + subFeature.nodeCount().longValue();
    }
    return childNodeCount;
  }

  public Parent() {}

  public String toString() {

    return "Parent{"
        + "subFeatures := "
        + Utils.toString(subFeatures)
        + ", type := "
        + Utils.toString(type)
        + "}";
  }
}
