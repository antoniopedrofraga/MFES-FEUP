package vdmpp;

import java.util.*;
import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class ConfigGenerator {
  private Model model;

  public void cg_init_ConfigGenerator_1(final Model m) {

    model = m;
    return;
  }

  public ConfigGenerator(final Model m) {

    cg_init_ConfigGenerator_1(m);
  }

  public VDMSet generateValidConfigs() {

    Feature root = model.getRoot();
    ConfigSearcher searcher = new ConfigSearcher(root);
    VDMSet generatedValidConfigs = searcher.getValidConfigs();
    return Utils.copy(generatedValidConfigs);
  }

  public ConfigGenerator() {}

  public String toString() {

    return "ConfigGenerator{" + "model := " + Utils.toString(model) + "}";
  }
}
