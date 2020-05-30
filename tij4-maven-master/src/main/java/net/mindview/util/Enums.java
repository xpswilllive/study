//: net/mindview/util/Enums.java
package net.mindview.util;
import java.util.*;

public class Enums {
  private static Random rand = new Random(47);
  public static <T extends Enum<T>> T random(Class<T> ec) {
	  //Class.getEnumConstants()返回此枚举类的元素数组，如果此Class对象不表示枚举类型，则返回null
    return random(ec.getEnumConstants());
  }
  public static <T> T random(T[] values) {
    return values[rand.nextInt(values.length)];
  }
} ///:~
