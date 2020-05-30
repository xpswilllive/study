//: enumerated/menu/Course.java
package enumerated.menu;
import net.mindview.util.*;

//菜
public enum Course {
	//开胃菜
  APPETIZER(Food.Appetizer.class),
  //主菜
  MAINCOURSE(Food.MainCourse.class),
  DESSERT(Food.Dessert.class),
  COFFEE(Food.Coffee.class);
  private Food[] values;
  //返回这个类型的枚举常量的数组
  private Course(Class<? extends Food> kind) {
    values = kind.getEnumConstants();
  }
  public Food randomSelection() {
	  //随机返回数组中的一个枚举常量
    return Enums.random(values);
  }
} ///:~
