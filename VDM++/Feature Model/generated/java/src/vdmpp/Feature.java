package vdmpp;

import java.util.*;
import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class Feature {
  public String name;
  protected Boolean mandatory = true;
  protected VDMSeq requirements = SeqUtil.seq();
  protected VDMSeq exclusions = SeqUtil.seq();

  public void cg_init_Feature_1(final String n) {

    name = n;
    return;
  }

  public Feature(final String n) {

    cg_init_Feature_1(n);
  }

  public void setMandatory(final Boolean b) {

    mandatory = b;
  }

  public void setRequirements(final VDMSeq fs) {

    requirements = Utils.copy(fs);
  }

  public void setExclusions(final VDMSeq fs) {

    exclusions = Utils.copy(fs);
  }

  public VDMSeq getRequirements() {

    return Utils.copy(requirements);
  }

  public VDMSeq getExclusions() {

    return Utils.copy(exclusions);
  }

  public String getName() {

    return name;
  }

  public VDMSet features() {

    return SetUtil.set(name);
  }

  public VDMSeq invalidSubsets() {

    VDMSeq restrictions = getReqAndExcRestrictions();
    return Utils.copy(restrictions);
  }

  public VDMSeq getReqAndExcRestrictions() {

    VDMSeq restrictions = SeqUtil.seq();
    if (requirements.size() + exclusions.size() > 0L) {
      for (Iterator iterator_23 = requirements.iterator(); iterator_23.hasNext(); ) {
        Feature requirement = (Feature) iterator_23.next();
        restrictions =
            SeqUtil.conc(
                Utils.copy(restrictions),
                SeqUtil.seq(
                    MapUtil.munion(
                        MapUtil.map(new Maplet(name, true)),
                        MapUtil.map(new Maplet(requirement.getName(), false)))));
      }
      for (Iterator iterator_24 = exclusions.iterator(); iterator_24.hasNext(); ) {
        Feature exclusion = (Feature) iterator_24.next();
        restrictions =
            SeqUtil.conc(
                Utils.copy(restrictions),
                SeqUtil.seq(
                    MapUtil.munion(
                        MapUtil.map(new Maplet(name, true)),
                        MapUtil.map(new Maplet(exclusion.getName(), true)))));
      }
    }

    return Utils.copy(restrictions);
  }

  public Number nodeCount() {

    return 1L;
  }

  public Boolean isMandatory() {

    return mandatory;
  }

  public Boolean isRespectingReqAndExc(final VDMMap c) {

    VDMSet configuredFeatures = MapUtil.dom(MapUtil.rngResTo(Utils.copy(c), SetUtil.set(true)));
    for (Iterator iterator_25 = requirements.iterator(); iterator_25.hasNext(); ) {
      Feature requirement = (Feature) iterator_25.next();
      if (!(SetUtil.inSet(requirement.name, configuredFeatures))) {
        return false;
      }
    }
    for (Iterator iterator_26 = exclusions.iterator(); iterator_26.hasNext(); ) {
      Feature exclusion = (Feature) iterator_26.next();
      if (SetUtil.inSet(exclusion.name, configuredFeatures)) {
        return false;
      }
    }
    return true;
  }

  public Boolean isValidConfiguration(final VDMMap c) {

    Boolean andResult_5 = false;

    if (mandatory) {
      if (!(Utilities.isNameConfigured(name, Utils.copy(c)))) {
        andResult_5 = true;
      }
    }

    if (andResult_5) {
      return false;
    }

    return isRespectingReqAndExc(Utils.copy(c));
  }

  public Feature() {}

  public String toString() {

    return "Feature{"
        + "name := "
        + Utils.toString(name)
        + ", mandatory := "
        + Utils.toString(mandatory)
        + ", requirements := "
        + Utils.toString(requirements)
        + ", exclusions := "
        + Utils.toString(exclusions)
        + "}";
  }
}