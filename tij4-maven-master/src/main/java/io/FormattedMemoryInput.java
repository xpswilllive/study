package io;
import java.io.*;

public class FormattedMemoryInput {
  public static void main(String[] args)
  throws IOException {
    try {
      DataInputStream in = new DataInputStream(
        new ByteArrayInputStream(
         BufferedInputFile.read(
          "src/main/java/io/FormattedMemoryInput.java").getBytes()));
      while(true) {
        System.out.print((char)in.readByte());
//		String readLine = in.readLine();
//		System.out.println(readLine);
	}
    } catch(EOFException e) {
      System.err.println("End of stream");
    }
  }
} /* (Execute to see output) *///:~
