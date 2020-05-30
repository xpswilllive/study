package containers;
// Demonstrates Reference objects
import java.lang.ref.*;
import java.util.*;

class VeryBig {
  private static final int SIZE = 10000;
  private long[] la = new long[SIZE];
  private String ident;
  public VeryBig(String id) { ident = id; }
  public String toString() { return ident; }
  protected void finalize() {
    System.out.println("Finalizing " + ident);
  }
}

public class References {
  private static ReferenceQueue<VeryBig> rq =
    new ReferenceQueue<VeryBig>();
  public static void checkQueue() {
    Reference<? extends VeryBig> inq = rq.poll();
    if(inq != null)
      System.out.println("In queue: " + inq.get());
  }
  public static void main(String[] args) {
    int size = 10;
    //				        经由
    // Or, choose size via the command line:
    if(args.length > 0)
      size = new Integer(args[0]);
    LinkedList<SoftReference<VeryBig>> sa =
      new LinkedList<SoftReference<VeryBig>>();
    for(int i = 0; i < size; i++) {
      sa.add(new SoftReference<VeryBig>(
        new VeryBig("Soft " + i), rq));
      System.out.println("Just created: " + sa.getLast());
      checkQueue();
    }
    LinkedList<WeakReference<VeryBig>> wa =
      new LinkedList<WeakReference<VeryBig>>();
    for(int i = 0; i < size; i++) {
      wa.add(new WeakReference<VeryBig>(
        new VeryBig("Weak " + i), rq));
      System.out.println("Just created: " + wa.getLast());
      checkQueue();
    }
    SoftReference<VeryBig> s =
      new SoftReference<VeryBig>(new VeryBig("Soft"));
    WeakReference<VeryBig> w =
      new WeakReference<VeryBig>(new VeryBig("Weak"));
    //调用释放对象的finalize()方法
    System.gc();
    LinkedList<PhantomReference<VeryBig>> pa =
      new LinkedList<PhantomReference<VeryBig>>();
    for(int i = 0; i < size; i++) {
      pa.add(new PhantomReference<VeryBig>(
        new VeryBig("Phantom " + i), rq));
      System.out.println("Just created: " + pa.getLast());
      checkQueue();
    }
  }
} /* (Execute to see output) *///:~
/*Just created: java.lang.ref.SoftReference@dfd3711
Just created: java.lang.ref.SoftReference@5f2050f6
Just created: java.lang.ref.SoftReference@3b81a1bc
Just created: java.lang.ref.SoftReference@64616ca2
Just created: java.lang.ref.SoftReference@13fee20c
Just created: java.lang.ref.SoftReference@4e04a765
Just created: java.lang.ref.SoftReference@783e6358
Just created: java.lang.ref.SoftReference@17550481
Just created: java.lang.ref.SoftReference@735f7ae5
Just created: java.lang.ref.SoftReference@180bc464
Just created: java.lang.ref.WeakReference@1324409e
Just created: java.lang.ref.WeakReference@2c6a3f77
Just created: java.lang.ref.WeakReference@246ae04d
Just created: java.lang.ref.WeakReference@62043840
Just created: java.lang.ref.WeakReference@5315b42e
Just created: java.lang.ref.WeakReference@2ef9b8bc
Just created: java.lang.ref.WeakReference@5d624da6
Just created: java.lang.ref.WeakReference@1e67b872
Just created: java.lang.ref.WeakReference@60addb54
Just created: java.lang.ref.WeakReference@3f2a3a5
Finalizing Weak
Finalizing Weak 9
Finalizing Weak 8
Finalizing Weak 7
Finalizing Weak 6
Finalizing Weak 5
Finalizing Weak 4
Finalizing Weak 3
Finalizing Weak 2
Finalizing Weak 1
Finalizing Weak 0
Just created: java.lang.ref.PhantomReference@5034c75a
In queue: null
Just created: java.lang.ref.PhantomReference@396a51ab
In queue: null
Just created: java.lang.ref.PhantomReference@51081592
In queue: null
Just created: java.lang.ref.PhantomReference@7f9a81e8
In queue: null
Just created: java.lang.ref.PhantomReference@9629756
In queue: null
Just created: java.lang.ref.PhantomReference@62ee68d8
In queue: null
Just created: java.lang.ref.PhantomReference@735b5592
In queue: null
Just created: java.lang.ref.PhantomReference@58651fd0
In queue: null
Just created: java.lang.ref.PhantomReference@4520ebad
In queue: null
Just created: java.lang.ref.PhantomReference@5419f379
In queue: null*/
