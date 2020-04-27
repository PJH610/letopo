package com.letopo.core.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author jh
 * @version 1.0
 * @date 2020-04-26 11:45
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface HttpMethod {
    String description();
    ResultType type() default ResultType.COMMONS;
    String retName() default "";
    int maxAge() default -1;
    String permission() default "";
    String permissionParentName() default "";
    String permissionName() default "";
}
