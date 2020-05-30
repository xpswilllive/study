package enumerated;
// Capabilities of the Enum class
import static net.mindview.util.Print.*;

//enum不能继承
//灌木丛 { 地面， 爬行， 悬挂}
enum Shrubbery { GROUND, CRAWLING, HANGING }

public class EnumClass {
  public static void main(String[] args) {
	  //返回枚举类型的枚举常量
    for(Shrubbery s : Shrubbery.values()) {
    	//返回此枚举常数的序数（其枚举声明中的位置，其中初始常数的序数为零）
      print(s + " ordinal: " + s.ordinal());//枚举常数 ordinal: 声明顺序
      printnb(s.compareTo(Shrubbery.CRAWLING) + " ");//-1 
      printnb(s.equals(Shrubbery.CRAWLING) + " ");//false 
      print(s == Shrubbery.CRAWLING);//false
      print(s.getDeclaringClass());//这个类的声明类
      print(s.name());//枚举常数的名称
      print("----------------------");
    }
    // Produce an enum value from a string name:
    for(String s : "HANGING CRAWLING GROUND".split(" ")) {
    	//参数：类返回常量的枚举类型的 类对象，常量的名称
      Shrubbery shrub = Enum.valueOf(Shrubbery.class, s);
      print(shrub);
    }
  }
} /* Output:
GROUND ordinal: 0
-1 false false
class Shrubbery
GROUND
----------------------
CRAWLING ordinal: 1
0 true true
class Shrubbery
CRAWLING
----------------------
HANGING ordinal: 2
1 false false
class Shrubbery
HANGING
----------------------
HANGING
CRAWLING
GROUND
*///:~
