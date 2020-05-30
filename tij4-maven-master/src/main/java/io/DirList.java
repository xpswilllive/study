package io;
// Display a directory listing using regular expressions.
// {Args: "D.*\.java"}
import java.util.regex.*;
import java.io.*;
import java.util.*;

public class DirList {
  public static void main(String[] args) {
	String s = "//\\";
//	System.out.println(s);
    File path = new File(".");
    String[] list;
    if(args.length == 0)
      list = path.list();
    else
    	//因为.匹配任意一个字符
      list = path.list(new DirFilter(args[0]));//^\.\w+
    //以.开头，后缀名不限制
    Arrays.sort(list, String.CASE_INSENSITIVE_ORDER);
    for(String dirItem : list)
      System.out.println(dirItem);
  }
}

class DirFilter implements FilenameFilter {
  private Pattern pattern;
  public DirFilter(String regex) {
	//将给定的正则表达式编译为模式
    pattern = Pattern.compile(regex);
  }
  public boolean accept(File dir, String name) {
	//Pattern.matcher()创建一个匹配器，匹配给定的输入与此模式，返回这种模式的新匹配器
	//Matcher.matches()尝试将整个区域与模式进行匹配
    return pattern.matcher(name).matches();
  }
} /* Output:
DirectoryDemo.java
DirList.java
DirList2.java
DirList3.java
*///:~
