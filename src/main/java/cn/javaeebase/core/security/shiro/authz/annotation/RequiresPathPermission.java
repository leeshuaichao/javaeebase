package cn.javaeebase.core.security.shiro.authz.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 自定义权限注册 需要配合RequiresMethodPermissions 使用
 * 
 * @author 李帅超
 *
 */
@Target({ ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
public @interface RequiresPathPermission {

	String value();

}
