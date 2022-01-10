package com.wind.aop.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created By wind
 * on 2019-11-01
 */
@Retention(RetentionPolicy.CLASS)
@Target(ElementType.METHOD)
public @interface UiThread {
}
