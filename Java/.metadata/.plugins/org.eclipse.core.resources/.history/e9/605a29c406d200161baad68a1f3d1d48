
import java.util.*;
import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class Utilities {
  public Utilities() {}

  public static VDMSet mapToSet(final VDMMap c) {

    VDMSet setCompResult_8 = SetUtil.set();
    VDMSet set_8 = MapUtil.dom(Utils.copy(c));
    for (Iterator iterator_8 = set_8.iterator(); iterator_8.hasNext(); ) {
      String a = ((String) iterator_8.next());
      VDMSet set_9 = MapUtil.rng(Utils.copy(c));
      for (Iterator iterator_9 = set_9.iterator(); iterator_9.hasNext(); ) {
        Boolean b = ((Boolean) iterator_9.next());
        if (Utils.equals(b, ((Boolean) Utils.get(c, a)))) {
          setCompResult_8.add(MapUtil.map(new Maplet(a, b)));
        }
      }
    }
    return Utils.copy(setCompResult_8);
  }

  public static Boolean isNameConfigured(final String n, final VDMMap c) {

    return Utils.equals(
        MapUtil.domResTo(SetUtil.set(n), Utils.copy(c)), MapUtil.map(new Maplet(n, true)));
  }

  public String toString() {

    return "Utilities{}";
  }
}
