
import java.util.*;
import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class Utilities {
  public VDMSet invalidSubsets(final VDMMap c) {

    VDMSet setCompResult_14 = SetUtil.set();
    VDMSet set_19 = MapUtil.dom(MapUtil.rngResTo(Utils.copy(c), SetUtil.set(true)));
    for (Iterator iterator_19 = set_19.iterator(); iterator_19.hasNext(); ) {
      String elem = ((String) iterator_19.next());
      setCompResult_14.add(elem);
    }
    return Utils.copy(setCompResult_14);
  }

  public Utilities() {}

  public String toString() {

    return "Utilities{}";
  }
}
