//: enumerated/Input.java
package enumerated;
import java.util.*;

public enum Input {
	//五美分		十分硬币	两角五分		美元
  NICKEL(5), DIME(10), QUARTER(25), DOLLAR(100),
  //牙膏				薯条			苏打			肥皂
  TOOTHPASTE(200), CHIPS(75), SODA(100), SOAP(50),
  //中止交易
  ABORT_TRANSACTION {
    public int amount() { // Disallow
      throw new RuntimeException("ABORT.amount()");
    }
  },
  STOP { // This must be the last instance.
    public int amount() { // Disallow
      throw new RuntimeException("SHUT_DOWN.amount()");
    }
  };	
  int value; // In cents 以分计算
  Input(int value) { this.value = value; }
  Input() {}
  int amount() { return value; }; // In cents
  static Random rand = new Random(47);
  public static Input randomSelection() {
    // Don't include STOP:
    return values()[rand.nextInt(values().length - 1)];
  }
} ///:~
