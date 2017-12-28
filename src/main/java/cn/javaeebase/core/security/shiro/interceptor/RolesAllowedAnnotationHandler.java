package cn.javaeebase.core.security.shiro.interceptor;

import java.lang.annotation.Annotation;
import java.util.Arrays;

import org.apache.shiro.authz.AuthorizationException;
import org.apache.shiro.authz.aop.AuthorizingAnnotationHandler;

import cn.javaeebase.core.security.shiro.authz.annotation.RolesAllowed;

/**
 * 拦截器
 * 
 * @author 李帅超
 *
 */
public class RolesAllowedAnnotationHandler extends AuthorizingAnnotationHandler {

	/**
	 * 构造函数
	 * 
	 * @param annotationClass
	 */
	public RolesAllowedAnnotationHandler() {
		super(RolesAllowed.class);
	}

	@Override
	public void assertAuthorized(Annotation a) throws AuthorizationException {
		RolesAllowed rrAnnotation = (RolesAllowed) a;
		String[] roles = rrAnnotation.value();
		getSubject().checkRoles(Arrays.asList(roles));
		return;
	}

}