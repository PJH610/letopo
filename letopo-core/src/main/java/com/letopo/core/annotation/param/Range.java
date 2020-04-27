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
public @interface Range {
    long min() default Long.MIN_VALUE;
    long max() default Long.MAX_VALUE;
}
