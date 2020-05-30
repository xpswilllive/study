//: net/mindview/util/Sets.java
package net.mindview.util;
import java.util.*;

public class Sets {
	/**
	 * to 往a中添加b
	 * @param a
	 * @param b
	 * @return
	 */
  public static <T> Set<T> union(Set<T> a, Set<T> b) {
    Set<T> result = new HashSet<T>(a);
    result.addAll(b);
    return result;
  }
  /**
   * to 取a和b的交集
   * @param a
   * @param b
   * @return
   */
  public static <T>
  Set<T> intersection(Set<T> a, Set<T> b) {
    Set<T> result = new HashSet<T>(a);
    result.retainAll(b);
    return result;
  }	
  /**
   * to 剔除交集
   * @param superset
   * @param subset
   * @return
   */
  // Subtract subset from superset:
  public static <T> Set<T>
  difference(Set<T> superset, Set<T> subset) {
    Set<T> result = new HashSet<T>(superset);
    result.removeAll(subset);
    return result;
  }
  /**
   * to 剔除a和b合集中公共的部分
   * @param a
   * @param b
   * @return
   */
  // Reflexive--everything not in the intersection:
  public static <T> Set<T> complement(Set<T> a, Set<T> b) {
    return difference(union(a, b), intersection(a, b));
  }
} ///:~
