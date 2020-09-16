package org.simpleframework.aop.annotation;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Aspect {
    String pointcut();
    //"execution(* com.imooc.controller.frontend..*.*(..))"以及within(com.imooc.controller.frontend.*)
}
