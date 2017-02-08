package quotes;

import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class xorParentQuote {
  private static int hc = 0;
  private static xorParentQuote instance = null;

  public xorParentQuote() {

    if (Utils.equals(hc, 0)) {
      hc = super.hashCode();
    }
  }

  public static xorParentQuote getInstance() {

    if (Utils.equals(instance, null)) {
      instance = new xorParentQuote();
    }

    return instance;
  }

  public int hashCode() {

    return hc;
  }

  public boolean equals(final Object obj) {

    return obj instanceof xorParentQuote;
  }

  public String toString() {

    return "<xorParent>";
  }
}
