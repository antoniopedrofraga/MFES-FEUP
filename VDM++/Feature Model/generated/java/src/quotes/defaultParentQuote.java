package quotes;

import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class defaultParentQuote {
  private static int hc = 0;
  private static defaultParentQuote instance = null;

  public defaultParentQuote() {

    if (Utils.equals(hc, 0)) {
      hc = super.hashCode();
    }
  }

  public static defaultParentQuote getInstance() {

    if (Utils.equals(instance, null)) {
      instance = new defaultParentQuote();
    }

    return instance;
  }

  public int hashCode() {

    return hc;
  }

  public boolean equals(final Object obj) {

    return obj instanceof defaultParentQuote;
  }

  public String toString() {

    return "<defaultParent>";
  }
}
