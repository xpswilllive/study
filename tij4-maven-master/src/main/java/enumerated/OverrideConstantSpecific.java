package enumerated;
import static net.mindview.util.Print.*;

public enum OverrideConstantSpecific {
	//螺母，螺栓，垫圈
  NUT, BOLT,
  WASHER {
	  //重写常量相关方法
    void f() { print("Overridden method"); }
  };
  void f() { print("default behavior"); }
  public static void main(String[] args) {
    for(OverrideConstantSpecific ocs : values()) {
      printnb(ocs + ": ");
      ocs.f();
    }
  }
} /* Output:
NUT: default behavior
BOLT: default behavior
WASHER: Overridden method
*///:~
