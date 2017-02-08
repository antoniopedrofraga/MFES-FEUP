
import java.util.*;
import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class Model {
  protected Feature root;
  private VDMSet features = SetUtil.set();

  public void cg_init_Model_1(final Feature r) {

    root = r;
    return;
  }

  public Model(final Feature r) {

    cg_init_Model_1(r);
  }

  public Feature getRoot() {

    return root;
  }

  public Number nodeCount() {

    return root.nodeCount();
  }

  public void setFeatures() {

    features = root.features();
  }

  public VDMSet generateValidConfigs() {

    setFeatures();
    return new ConfigSearcher(root).getValidConfigs();
  }

  public Model() {}

  public String toString() {

    return "Model{"
        + "root := "
        + Utils.toString(root)
        + ", features := "
        + Utils.toString(features)
        + "}";
  }
}
