//: enumerated/EnumSets.java
// Operations on EnumSets
package enumerated;
import java.util.*;
import static enumerated.AlarmPoints.*;
import static net.mindview.util.Print.*;

public class EnumSets {
  public static void main(String[] args) {
	  //使用指定的元素类型创建一个空的枚举集
    EnumSet<AlarmPoints> points =
      EnumSet.noneOf(AlarmPoints.class); // Empty set
    points.add(BATHROOM);
    print(points);
    //EnumSet.of(E , E...)创建一个最初包含指定元素的枚举集
    points.addAll(EnumSet.of(STAIR1, STAIR2, KITCHEN));
    print(points);
    //allOf创建一个包含指定元素类型中所有元素的枚举集
    points = EnumSet.allOf(AlarmPoints.class);
    points.removeAll(EnumSet.of(STAIR1, STAIR2, KITCHEN));
    print(points);
    //range创建最初包含由两个指定端点定义的范围内的所有元素的枚举集
    points.removeAll(EnumSet.range(OFFICE1, OFFICE4));
    print(points);
    //此类型的枚举类 剔除掉指定元素
    points = EnumSet.complementOf(points);
    print(points);
  }
} /* Output:
[BATHROOM]
[STAIR1, STAIR2, BATHROOM, KITCHEN]
[LOBBY, OFFICE1, OFFICE2, OFFICE3, OFFICE4, BATHROOM, UTILITY]
[LOBBY, BATHROOM, UTILITY]
[STAIR1, STAIR2, OFFICE1, OFFICE2, OFFICE3, OFFICE4, KITCHEN]
*///:~
