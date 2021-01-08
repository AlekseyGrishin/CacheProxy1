package com.grishin.proxy.annotations;

import com.grishin.proxy.CacheType;

import javax.xml.bind.annotation.XmlType;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Cache {

    CacheType cacheType() default CacheType.FILE;
    String fileNamePrefix() default "";
    boolean zip() default false;
    int listList() default 0;
    Class[] identityBy() default XmlType.DEFAULT.class;

}
