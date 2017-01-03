
import java.util.*;
import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class ConfigGenerator {
  public VDMSet generateValidConfigs(final Model model) {

    Feature root = model.getRoot();
    ConfigSearcher searcher = new ConfigSearcher(root);
    VDMSet generatedValidConfigs = searcher.getValidConfigs();
    return Utils.copy(generatedValidConfigs);
  }

  public ConfigGenerator() {}

  public String toString() {

    return "ConfigGenerator{}";
  }
}
