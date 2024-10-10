// ImportantMethod.java
import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface ImportantMethod {
    String info() default "This is an important method";
}
