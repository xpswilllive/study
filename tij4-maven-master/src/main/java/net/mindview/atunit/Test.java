//: net/mindview/atunit/Test.java
// The @Test tag.
package net.mindview.atunit;
import java.lang.annotation.*;

//注解用于什么地方
@Target(ElementType.METHOD)
//注解在哪一级别可用
@Retention(RetentionPolicy.RUNTIME)
public @interface Test {} ///:~
