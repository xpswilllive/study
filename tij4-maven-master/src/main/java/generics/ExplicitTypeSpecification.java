package generics;
import typeinfo.pets.*;
import java.util.*;
import net.mindview.util.*;

public class ExplicitTypeSpecification {
  static void f(Map<Person, List<Pet>> petPeople) {}
  public static void main(String[] args) {
	  //把尖括号置于操作符合方法之间
    f(New.<Person, List<Pet>>map());
  }
} ///:~
