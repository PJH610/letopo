package com.letopo.core.annotation;

import java.lang.annotation.*;

/**
 * @author jh
 * @version 1.0
 * @date 2020-04-26 11:47
 */
@Target(ElementType.PARAMETER)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface HttpParam {
    String name();
    HttpParamType type() default HttpParamType.COMMON;
    String description() default "";
    String valueDef() default "";
}
