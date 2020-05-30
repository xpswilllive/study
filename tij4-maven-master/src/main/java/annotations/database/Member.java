//: annotations/database/Member.java
package annotations.database;

@DBTable(name = "MEMBER")
public class Member {
	//注解元素如果叫value，并且在用到地方中，value是唯一需要赋值的元素，则可以直接在（）内直接写要赋的值
  @SQLString(30) String firstName;
  @SQLString(50) String lastName;
  @SQLInteger Integer age;
  @SQLString(value = 30,
  constraints = @Constraints(primaryKey = true))
  String handle;
  static int memberCount;
  public String getHandle() { return handle; }
  public String getFirstName() { return firstName; }
  public String getLastName() { return lastName; }
  public String toString() { return handle; }
  public Integer getAge() { return age; }
} ///:~
