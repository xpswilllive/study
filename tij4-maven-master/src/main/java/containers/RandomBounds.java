package containers;
// Does Math.random() produce 0.0 and 1.0?
// {RunByHand}
import static net.mindview.util.Print.*;

public class RandomBounds {
  static void usage() {
    print("Usage:");
    print("\tRandomBounds lower");
    print("\tRandomBounds upper");
    System.exit(1);
  }
  public static void main(String[] args) {
//	伪随机数的区间为[0.0, 1.0)
	double random = Math.random();
//	0.16814713184431895
//	System.out.println(random);
    if(args.length != 1) usage();
    if(args[0].equals("lower")) {
	while(random != 0.0)
        ; // Keep trying
      print("Produced 0.0!");
    }
    else if(args[0].equals("upper")) {
      while(Math.random() != 1.0)
        ; // Keep trying
      print("Produced 1.0!");
    }
    else
      usage();
  }
} ///:~
