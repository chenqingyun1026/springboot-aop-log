package cn.cqy.springaopdemo.anno;

import java.lang.annotation.*;

/**
 * 自定义日志注解
 */
@Target(ElementType.METHOD) //注解防止位置
@Retention(RetentionPolicy.RUNTIME)//运行时可见
@Documented //生成文档
public @interface MyLog {
    String operation() default "";

    int type();
}
