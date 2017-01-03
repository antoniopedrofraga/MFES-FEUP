package quotes;

import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class orParentQuote {
  private static int hc = 0;
  private static orParentQuote instance = null;

  public orParentQuote() {

    if (Utils.equals(hc, 0)) {
      hc = super.hashCode();
    }
  }

  public static orParentQuote getInstance() {

    if (Utils.equals(instance, null)) {
      instance = new orParentQuote();
    }

    return instance;
  }

  public int hashCode() {

    return hc;
  }

  public boolean equals(final Object obj) {

    return obj instanceof orParentQuote;
  }

  public String toString() {

    return "<orParent>";
  }
}
