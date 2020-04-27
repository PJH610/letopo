package com.letopo.core.annotation.param;

import java.lang.annotation.*;

/**
 * @author jh
 * @version 1.0
 * @date 2020-04-26 15:49
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.PARAMETER)
@Documented
public @interface TextFormat {
    String regex() default "";
    String[] contains() default {};
    String[] notContains() default {};
    String startWith() default "";
    String endsWith() default "";
    int lengthMax() default Integer.MAX_VALUE;
    int lengthMin() default 0;
    int length() default -1;
    boolean notChinese() default false;
}
