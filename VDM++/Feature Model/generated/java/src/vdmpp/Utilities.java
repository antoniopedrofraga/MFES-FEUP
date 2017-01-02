package vdmpp;

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

  public static VDMSet seqToSet(final VDMSeq c) {

    VDMSet setCompResult_9 = SetUtil.set();
    VDMSeq set_10 = Utils.copy(c);
    for (Iterator iterator_10 = set_10.iterator(); iterator_10.hasNext(); ) {
      VDMMap a = ((VDMMap) iterator_10.next());
      setCompResult_9.add(Utils.copy(a));
    }
    return Utils.copy(setCompResult_9);
  }

  public static Boolean isNameConfigured(final String n, final VDMMap c) {

    return Utils.equals(
        MapUtil.domResTo(SetUtil.set(n), Utils.copy(c)), MapUtil.map(new Maplet(n, true)));
  }

  public static VDMSet eshopValidConfigs() {

    return SetUtil.set(
        MapUtil.map(
            new Maplet("e-shop", true),
            new Maplet("catalogue", true),
            new Maplet("payment", true),
            new Maplet("bank transfer", false),
            new Maplet("credit card", true),
            new Maplet("security", true),
            new Maplet("high", true),
            new Maplet("standard", false),
            new Maplet("search", false)),
        MapUtil.map(
            new Maplet("e-shop", true),
            new Maplet("catalogue", true),
            new Maplet("payment", true),
            new Maplet("bank transfer", false),
            new Maplet("credit card", true),
            new Maplet("security", true),
            new Maplet("high", true),
            new Maplet("standard", false),
            new Maplet("search", true)),
        MapUtil.map(
            new Maplet("e-shop", true),
            new Maplet("catalogue", true),
            new Maplet("payment", true),
            new Maplet("bank transfer", true),
            new Maplet("credit card", false),
            new Maplet("security", true),
            new Maplet("high", false),
            new Maplet("standard", true),
            new Maplet("search", false)),
        MapUtil.map(
            new Maplet("e-shop", true),
            new Maplet("catalogue", true),
            new Maplet("payment", true),
            new Maplet("bank transfer", true),
            new Maplet("credit card", false),
            new Maplet("security", true),
            new Maplet("high", false),
            new Maplet("standard", true),
            new Maplet("search", true)),
        MapUtil.map(
            new Maplet("e-shop", true),
            new Maplet("catalogue", true),
            new Maplet("payment", true),
            new Maplet("bank transfer", true),
            new Maplet("credit card", false),
            new Maplet("security", true),
            new Maplet("high", true),
            new Maplet("standard", false),
            new Maplet("search", false)),
        MapUtil.map(
            new Maplet("e-shop", true),
            new Maplet("catalogue", true),
            new Maplet("payment", true),
            new Maplet("bank transfer", true),
            new Maplet("credit card", false),
            new Maplet("security", true),
            new Maplet("high", true),
            new Maplet("standard", false),
            new Maplet("search", true)),
        MapUtil.map(
            new Maplet("e-shop", true),
            new Maplet("catalogue", true),
            new Maplet("payment", true),
            new Maplet("bank transfer", true),
            new Maplet("credit card", true),
            new Maplet("security", true),
            new Maplet("high", true),
            new Maplet("standard", false),
            new Maplet("search", false)),
        MapUtil.map(
            new Maplet("e-shop", true),
            new Maplet("catalogue", true),
            new Maplet("payment", true),
            new Maplet("bank transfer", true),
            new Maplet("credit card", true),
            new Maplet("security", true),
            new Maplet("high", true),
            new Maplet("standard", false),
            new Maplet("search", true)));
  }

  public static VDMSet mobilePhoneValidConfigs() {

    return SetUtil.set(
        MapUtil.map(
            new Maplet("mobile phone", true),
            new Maplet("media", false),
            new Maplet("camera", false),
            new Maplet("mp3", false),
            new Maplet("calls", true),
            new Maplet("gps", false),
            new Maplet("screen", false),
            new Maplet("basic", false),
            new Maplet("colour", false),
            new Maplet("high resolution", false)),
        MapUtil.map(
            new Maplet("mobile phone", true),
            new Maplet("media", false),
            new Maplet("camera", false),
            new Maplet("mp3", false),
            new Maplet("calls", true),
            new Maplet("gps", false),
            new Maplet("screen", true),
            new Maplet("basic", false),
            new Maplet("colour", false),
            new Maplet("high resolution", true)),
        MapUtil.map(
            new Maplet("mobile phone", true),
            new Maplet("media", false),
            new Maplet("camera", false),
            new Maplet("mp3", false),
            new Maplet("calls", true),
            new Maplet("gps", false),
            new Maplet("screen", true),
            new Maplet("basic", false),
            new Maplet("colour", true),
            new Maplet("high resolution", false)),
        MapUtil.map(
            new Maplet("mobile phone", true),
            new Maplet("media", false),
            new Maplet("camera", false),
            new Maplet("mp3", false),
            new Maplet("calls", true),
            new Maplet("gps", false),
            new Maplet("screen", true),
            new Maplet("basic", true),
            new Maplet("colour", false),
            new Maplet("high resolution", false)),
        MapUtil.map(
            new Maplet("mobile phone", true),
            new Maplet("media", false),
            new Maplet("camera", false),
            new Maplet("mp3", false),
            new Maplet("calls", true),
            new Maplet("gps", true),
            new Maplet("screen", false),
            new Maplet("basic", false),
            new Maplet("colour", false),
            new Maplet("high resolution", false)),
        MapUtil.map(
            new Maplet("mobile phone", true),
            new Maplet("media", false),
            new Maplet("camera", false),
            new Maplet("mp3", false),
            new Maplet("calls", true),
            new Maplet("gps", true),
            new Maplet("screen", true),
            new Maplet("basic", false),
            new Maplet("colour", false),
            new Maplet("high resolution", true)),
        MapUtil.map(
            new Maplet("mobile phone", true),
            new Maplet("media", false),
            new Maplet("camera", false),
            new Maplet("mp3", false),
            new Maplet("calls", true),
            new Maplet("gps", true),
            new Maplet("screen", true),
            new Maplet("basic", false),
            new Maplet("colour", true),
            new Maplet("high resolution", false)),
        MapUtil.map(
            new Maplet("mobile phone", true),
            new Maplet("media", true),
            new Maplet("camera", false),
            new Maplet("mp3", false),
            new Maplet("calls", true),
            new Maplet("gps", false),
            new Maplet("screen", false),
            new Maplet("basic", false),
            new Maplet("colour", false),
            new Maplet("high resolution", false)),
        MapUtil.map(
            new Maplet("mobile phone", true),
            new Maplet("media", true),
            new Maplet("camera", false),
            new Maplet("mp3", false),
            new Maplet("calls", true),
            new Maplet("gps", false),
            new Maplet("screen", true),
            new Maplet("basic", false),
            new Maplet("colour", false),
            new Maplet("high resolution", true)),
        MapUtil.map(
            new Maplet("mobile phone", true),
            new Maplet("media", true),
            new Maplet("camera", false),
            new Maplet("mp3", false),
            new Maplet("calls", true),
            new Maplet("gps", false),
            new Maplet("screen", true),
            new Maplet("basic", false),
            new Maplet("colour", true),
            new Maplet("high resolution", false)),
        MapUtil.map(
            new Maplet("mobile phone", true),
            new Maplet("media", true),
            new Maplet("camera", false),
            new Maplet("mp3", false),
            new Maplet("calls", true),
            new Maplet("gps", false),
            new Maplet("screen", true),
            new Maplet("basic", true),
            new Maplet("colour", false),
            new Maplet("high resolution", false)),
        MapUtil.map(
            new Maplet("mobile phone", true),
            new Maplet("media", true),
            new Maplet("camera", false),
            new Maplet("mp3", false),
            new Maplet("calls", true),
            new Maplet("gps", true),
            new Maplet("screen", false),
            new Maplet("basic", false),
            new Maplet("colour", false),
            new Maplet("high resolution", false)),
        MapUtil.map(
            new Maplet("mobile phone", true),
            new Maplet("media", true),
            new Maplet("camera", false),
            new Maplet("mp3", false),
            new Maplet("calls", true),
            new Maplet("gps", true),
            new Maplet("screen", true),
            new Maplet("basic", false),
            new Maplet("colour", false),
            new Maplet("high resolution", true)),
        MapUtil.map(
            new Maplet("mobile phone", true),
            new Maplet("media", true),
            new Maplet("camera", false),
            new Maplet("mp3", false),
            new Maplet("calls", true),
            new Maplet("gps", true),
            new Maplet("screen", true),
            new Maplet("basic", false),
            new Maplet("colour", true),
            new Maplet("high resolution", false)),
        MapUtil.map(
            new Maplet("mobile phone", true),
            new Maplet("media", true),
            new Maplet("camera", false),
            new Maplet("mp3", true),
            new Maplet("calls", true),
            new Maplet("gps", false),
            new Maplet("screen", false),
            new Maplet("basic", false),
            new Maplet("colour", false),
            new Maplet("high resolution", false)),
        MapUtil.map(
            new Maplet("mobile phone", true),
            new Maplet("media", true),
            new Maplet("camera", false),
            new Maplet("mp3", true),
            new Maplet("calls", true),
            new Maplet("gps", false),
            new Maplet("screen", true),
            new Maplet("basic", false),
            new Maplet("colour", false),
            new Maplet("high resolution", true)),
        MapUtil.map(
            new Maplet("mobile phone", true),
            new Maplet("media", true),
            new Maplet("camera", false),
            new Maplet("mp3", true),
            new Maplet("calls", true),
            new Maplet("gps", false),
            new Maplet("screen", true),
            new Maplet("basic", false),
            new Maplet("colour", true),
            new Maplet("high resolution", false)),
        MapUtil.map(
            new Maplet("mobile phone", true),
            new Maplet("media", true),
            new Maplet("camera", false),
            new Maplet("mp3", true),
            new Maplet("calls", true),
            new Maplet("gps", false),
            new Maplet("screen", true),
            new Maplet("basic", true),
            new Maplet("colour", false),
            new Maplet("high resolution", false)),
        MapUtil.map(
            new Maplet("mobile phone", true),
            new Maplet("media", true),
            new Maplet("camera", false),
            new Maplet("mp3", true),
            new Maplet("calls", true),
            new Maplet("gps", true),
            new Maplet("screen", false),
            new Maplet("basic", false),
            new Maplet("colour", false),
            new Maplet("high resolution", false)),
        MapUtil.map(
            new Maplet("mobile phone", true),
            new Maplet("media", true),
            new Maplet("camera", false),
            new Maplet("mp3", true),
            new Maplet("calls", true),
            new Maplet("gps", true),
            new Maplet("screen", true),
            new Maplet("basic", false),
            new Maplet("colour", false),
            new Maplet("high resolution", true)),
        MapUtil.map(
            new Maplet("mobile phone", true),
            new Maplet("media", true),
            new Maplet("camera", false),
            new Maplet("mp3", true),
            new Maplet("calls", true),
            new Maplet("gps", true),
            new Maplet("screen", true),
            new Maplet("basic", false),
            new Maplet("colour", true),
            new Maplet("high resolution", false)),
        MapUtil.map(
            new Maplet("mobile phone", true),
            new Maplet("media", true),
            new Maplet("camera", true),
            new Maplet("mp3", false),
            new Maplet("calls", true),
            new Maplet("gps", false),
            new Maplet("screen", true),
            new Maplet("basic", false),
            new Maplet("colour", false),
            new Maplet("high resolution", true)),
        MapUtil.map(
            new Maplet("mobile phone", true),
            new Maplet("media", true),
            new Maplet("camera", true),
            new Maplet("mp3", false),
            new Maplet("calls", true),
            new Maplet("gps", true),
            new Maplet("screen", true),
            new Maplet("basic", false),
            new Maplet("colour", false),
            new Maplet("high resolution", true)),
        MapUtil.map(
            new Maplet("mobile phone", true),
            new Maplet("media", true),
            new Maplet("camera", true),
            new Maplet("mp3", true),
            new Maplet("calls", true),
            new Maplet("gps", false),
            new Maplet("screen", true),
            new Maplet("basic", false),
            new Maplet("colour", false),
            new Maplet("high resolution", true)),
        MapUtil.map(
            new Maplet("mobile phone", true),
            new Maplet("media", true),
            new Maplet("camera", true),
            new Maplet("mp3", true),
            new Maplet("calls", true),
            new Maplet("gps", true),
            new Maplet("screen", true),
            new Maplet("basic", false),
            new Maplet("colour", false),
            new Maplet("high resolution", true)));
  }

  public static VDMSet carValidConfigs() {

    return SetUtil.set(
        MapUtil.map(
            new Maplet("car", true),
            new Maplet("body", true),
            new Maplet("transmission", true),
            new Maplet("automatic", false),
            new Maplet("manual", true),
            new Maplet("pullsTrailler", false),
            new Maplet("lightTrailler", false),
            new Maplet("heavyTrailler", false),
            new Maplet("armor", false),
            new Maplet("engine", true),
            new Maplet("electric", false),
            new Maplet("gasoline", true)),
        MapUtil.map(
            new Maplet("car", true),
            new Maplet("body", true),
            new Maplet("transmission", true),
            new Maplet("automatic", false),
            new Maplet("manual", true),
            new Maplet("pullsTrailler", true),
            new Maplet("lightTrailler", false),
            new Maplet("heavyTrailler", true),
            new Maplet("armor", false),
            new Maplet("engine", true),
            new Maplet("electric", false),
            new Maplet("gasoline", true)),
        MapUtil.map(
            new Maplet("car", true),
            new Maplet("body", true),
            new Maplet("transmission", true),
            new Maplet("automatic", false),
            new Maplet("manual", true),
            new Maplet("pullsTrailler", true),
            new Maplet("lightTrailler", false),
            new Maplet("heavyTrailler", true),
            new Maplet("armor", true),
            new Maplet("engine", true),
            new Maplet("electric", false),
            new Maplet("gasoline", true)),
        MapUtil.map(
            new Maplet("car", true),
            new Maplet("body", true),
            new Maplet("transmission", true),
            new Maplet("automatic", false),
            new Maplet("manual", true),
            new Maplet("pullsTrailler", true),
            new Maplet("lightTrailler", true),
            new Maplet("heavyTrailler", false),
            new Maplet("armor", false),
            new Maplet("engine", true),
            new Maplet("electric", false),
            new Maplet("gasoline", true)),
        MapUtil.map(
            new Maplet("car", true),
            new Maplet("body", true),
            new Maplet("transmission", true),
            new Maplet("automatic", true),
            new Maplet("manual", false),
            new Maplet("pullsTrailler", false),
            new Maplet("lightTrailler", false),
            new Maplet("heavyTrailler", false),
            new Maplet("armor", false),
            new Maplet("engine", true),
            new Maplet("electric", false),
            new Maplet("gasoline", true)),
        MapUtil.map(
            new Maplet("car", true),
            new Maplet("body", true),
            new Maplet("transmission", true),
            new Maplet("automatic", true),
            new Maplet("manual", false),
            new Maplet("pullsTrailler", true),
            new Maplet("lightTrailler", false),
            new Maplet("heavyTrailler", true),
            new Maplet("armor", false),
            new Maplet("engine", true),
            new Maplet("electric", false),
            new Maplet("gasoline", true)),
        MapUtil.map(
            new Maplet("car", true),
            new Maplet("body", true),
            new Maplet("transmission", true),
            new Maplet("automatic", true),
            new Maplet("manual", false),
            new Maplet("pullsTrailler", true),
            new Maplet("lightTrailler", false),
            new Maplet("heavyTrailler", true),
            new Maplet("armor", true),
            new Maplet("engine", true),
            new Maplet("electric", false),
            new Maplet("gasoline", true)),
        MapUtil.map(
            new Maplet("car", true),
            new Maplet("body", true),
            new Maplet("transmission", true),
            new Maplet("automatic", true),
            new Maplet("manual", false),
            new Maplet("pullsTrailler", true),
            new Maplet("lightTrailler", true),
            new Maplet("heavyTrailler", false),
            new Maplet("armor", false),
            new Maplet("engine", true),
            new Maplet("electric", false),
            new Maplet("gasoline", true)),
        MapUtil.map(
            new Maplet("car", true),
            new Maplet("body", true),
            new Maplet("transmission", true),
            new Maplet("automatic", false),
            new Maplet("manual", true),
            new Maplet("pullsTrailler", false),
            new Maplet("lightTrailler", false),
            new Maplet("heavyTrailler", false),
            new Maplet("armor", false),
            new Maplet("engine", true),
            new Maplet("electric", true),
            new Maplet("gasoline", false)),
        MapUtil.map(
            new Maplet("car", true),
            new Maplet("body", true),
            new Maplet("transmission", true),
            new Maplet("automatic", false),
            new Maplet("manual", true),
            new Maplet("pullsTrailler", true),
            new Maplet("lightTrailler", false),
            new Maplet("heavyTrailler", true),
            new Maplet("armor", false),
            new Maplet("engine", true),
            new Maplet("electric", true),
            new Maplet("gasoline", false)),
        MapUtil.map(
            new Maplet("car", true),
            new Maplet("body", true),
            new Maplet("transmission", true),
            new Maplet("automatic", false),
            new Maplet("manual", true),
            new Maplet("pullsTrailler", true),
            new Maplet("lightTrailler", false),
            new Maplet("heavyTrailler", true),
            new Maplet("armor", true),
            new Maplet("engine", true),
            new Maplet("electric", true),
            new Maplet("gasoline", false)),
        MapUtil.map(
            new Maplet("car", true),
            new Maplet("body", true),
            new Maplet("transmission", true),
            new Maplet("automatic", false),
            new Maplet("manual", true),
            new Maplet("pullsTrailler", true),
            new Maplet("lightTrailler", true),
            new Maplet("heavyTrailler", false),
            new Maplet("armor", false),
            new Maplet("engine", true),
            new Maplet("electric", true),
            new Maplet("gasoline", false)),
        MapUtil.map(
            new Maplet("car", true),
            new Maplet("body", true),
            new Maplet("transmission", true),
            new Maplet("automatic", true),
            new Maplet("manual", false),
            new Maplet("pullsTrailler", false),
            new Maplet("lightTrailler", false),
            new Maplet("heavyTrailler", false),
            new Maplet("armor", false),
            new Maplet("engine", true),
            new Maplet("electric", true),
            new Maplet("gasoline", false)),
        MapUtil.map(
            new Maplet("car", true),
            new Maplet("body", true),
            new Maplet("transmission", true),
            new Maplet("automatic", true),
            new Maplet("manual", false),
            new Maplet("pullsTrailler", true),
            new Maplet("lightTrailler", false),
            new Maplet("heavyTrailler", true),
            new Maplet("armor", false),
            new Maplet("engine", true),
            new Maplet("electric", true),
            new Maplet("gasoline", false)),
        MapUtil.map(
            new Maplet("car", true),
            new Maplet("body", true),
            new Maplet("transmission", true),
            new Maplet("automatic", true),
            new Maplet("manual", false),
            new Maplet("pullsTrailler", true),
            new Maplet("lightTrailler", false),
            new Maplet("heavyTrailler", true),
            new Maplet("armor", true),
            new Maplet("engine", true),
            new Maplet("electric", true),
            new Maplet("gasoline", false)),
        MapUtil.map(
            new Maplet("car", true),
            new Maplet("body", true),
            new Maplet("transmission", true),
            new Maplet("automatic", true),
            new Maplet("manual", false),
            new Maplet("pullsTrailler", true),
            new Maplet("lightTrailler", true),
            new Maplet("heavyTrailler", false),
            new Maplet("armor", false),
            new Maplet("engine", true),
            new Maplet("electric", true),
            new Maplet("gasoline", false)),
        MapUtil.map(
            new Maplet("car", true),
            new Maplet("body", true),
            new Maplet("transmission", true),
            new Maplet("automatic", false),
            new Maplet("manual", true),
            new Maplet("pullsTrailler", false),
            new Maplet("lightTrailler", false),
            new Maplet("heavyTrailler", false),
            new Maplet("armor", false),
            new Maplet("engine", true),
            new Maplet("electric", true),
            new Maplet("gasoline", true)),
        MapUtil.map(
            new Maplet("car", true),
            new Maplet("body", true),
            new Maplet("transmission", true),
            new Maplet("automatic", false),
            new Maplet("manual", true),
            new Maplet("pullsTrailler", true),
            new Maplet("lightTrailler", false),
            new Maplet("heavyTrailler", true),
            new Maplet("armor", false),
            new Maplet("engine", true),
            new Maplet("electric", true),
            new Maplet("gasoline", true)),
        MapUtil.map(
            new Maplet("car", true),
            new Maplet("body", true),
            new Maplet("transmission", true),
            new Maplet("automatic", false),
            new Maplet("manual", true),
            new Maplet("pullsTrailler", true),
            new Maplet("lightTrailler", false),
            new Maplet("heavyTrailler", true),
            new Maplet("armor", true),
            new Maplet("engine", true),
            new Maplet("electric", true),
            new Maplet("gasoline", true)),
        MapUtil.map(
            new Maplet("car", true),
            new Maplet("body", true),
            new Maplet("transmission", true),
            new Maplet("automatic", false),
            new Maplet("manual", true),
            new Maplet("pullsTrailler", true),
            new Maplet("lightTrailler", true),
            new Maplet("heavyTrailler", false),
            new Maplet("armor", false),
            new Maplet("engine", true),
            new Maplet("electric", true),
            new Maplet("gasoline", true)),
        MapUtil.map(
            new Maplet("car", true),
            new Maplet("body", true),
            new Maplet("transmission", true),
            new Maplet("automatic", true),
            new Maplet("manual", false),
            new Maplet("pullsTrailler", false),
            new Maplet("lightTrailler", false),
            new Maplet("heavyTrailler", false),
            new Maplet("armor", false),
            new Maplet("engine", true),
            new Maplet("electric", true),
            new Maplet("gasoline", true)),
        MapUtil.map(
            new Maplet("car", true),
            new Maplet("body", true),
            new Maplet("transmission", true),
            new Maplet("automatic", true),
            new Maplet("manual", false),
            new Maplet("pullsTrailler", true),
            new Maplet("lightTrailler", false),
            new Maplet("heavyTrailler", true),
            new Maplet("armor", false),
            new Maplet("engine", true),
            new Maplet("electric", true),
            new Maplet("gasoline", true)),
        MapUtil.map(
            new Maplet("car", true),
            new Maplet("body", true),
            new Maplet("transmission", true),
            new Maplet("automatic", true),
            new Maplet("manual", false),
            new Maplet("pullsTrailler", true),
            new Maplet("lightTrailler", false),
            new Maplet("heavyTrailler", true),
            new Maplet("armor", true),
            new Maplet("engine", true),
            new Maplet("electric", true),
            new Maplet("gasoline", true)),
        MapUtil.map(
            new Maplet("car", true),
            new Maplet("body", true),
            new Maplet("transmission", true),
            new Maplet("automatic", true),
            new Maplet("manual", false),
            new Maplet("pullsTrailler", true),
            new Maplet("lightTrailler", true),
            new Maplet("heavyTrailler", false),
            new Maplet("armor", false),
            new Maplet("engine", true),
            new Maplet("electric", true),
            new Maplet("gasoline", true)));
  }

  public String toString() {

    return "Utilities{}";
  }
}