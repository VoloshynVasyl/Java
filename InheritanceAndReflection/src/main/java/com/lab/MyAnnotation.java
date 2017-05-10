package com.lab;

import java.lang.annotation.*;
/**
 * Created by Vasyl_Voloshyn on 5/10/2017.
 */
@Target(value=ElementType.METHOD)
@Retention(value= RetentionPolicy.RUNTIME)
public @interface MyAnnotation {
    String name();
}
