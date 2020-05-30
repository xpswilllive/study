package annotations;
import java.lang.annotation.*;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface UseCase {
	//注解的元素类似方法的定义，而且可以有默认值
  public int id();
  public String description() default "no description";
} ///:~
