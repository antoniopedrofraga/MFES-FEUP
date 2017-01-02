package vdmpp;

import java.util.*;
import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class ConfigGenerator {
  public VDMSeq generateValidConfigs(final Model model) {

    Feature root = model.getRoot();
    ConfigSearcher searcher = new ConfigSearcher(root);
    return searcher.getValidConfigs();
  }

  public ConfigGenerator() {}

  public String toString() {

    return "ConfigGenerator{}";
  }
}
