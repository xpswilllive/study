package io;
import java.nio.channels.*;
import java.util.concurrent.*;
import java.io.*;

public class FileLocking {
  public static void main(String[] args) throws Exception {
    FileOutputStream fos= new FileOutputStream("file.txt");
    //尝试获取此频道文件的排他锁。表示新获取的锁的锁定对象，如果由于另一个程序保持重叠锁定而无法获取锁， 则为 null 
    FileLock fl = fos.getChannel().tryLock();
    if(fl != null) {
      System.out.println("Locked File");
      TimeUnit.MILLISECONDS.sleep(1000);
      //如果此锁对象有效，则调用此方法将释放该锁并使该对象无效
      fl.release();
      System.out.println("Released Lock");
    }
    fos.close();
  }
} /* Output:
Locked File
Released Lock
*///:~
