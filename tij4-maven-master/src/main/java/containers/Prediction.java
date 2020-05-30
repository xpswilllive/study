package containers;
// Predicting the weather with groundhogs.
import java.util.*;

public class Prediction {
  private static Random rand = new Random(47);
  private boolean shadow = rand.nextDouble() > 0.5;
  public String toString() {
//	  System.out.println(rand.nextDouble());//0.5295954256745989
    if(shadow)
      return "Six more weeks of Winter!";
    else
      return "Early Spring!";
  }
} ///:~
