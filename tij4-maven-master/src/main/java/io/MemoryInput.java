package io;
import java.io.*;

public class MemoryInput {
  public static void main(String[] args)
  throws IOException {
	  //StringReader(读出来的字符串)
    StringReader in = new StringReader(
      BufferedInputFile.read("src/main/java/io/MemoryInput.java"));
    int c;
    //测试 奰鄨
    while((c = in.read()) != -1)
      System.out.print((char)c);
  }
} /* (Execute to see output) *///:~
