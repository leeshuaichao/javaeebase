package cn.javaeebase.core.filter.theme;

import cn.javaeebase.core.utils.CookieUtils;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author 李帅超
 * @Description: TODO 主题
 * @date 2018-01-04 10:42
 */
@WebFilter(filterName = "ThemeFilter")
public class ThemeFilter implements Filter {
    @Override
    public void destroy() {
    }
    @Override
    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        HttpServletRequest request = (HttpServletRequest) req;
        Cookie[] cookies = request.getCookies();
        for (Cookie cookie : cookies) {
            if (cookie!=null&&"theme".equals(cookie.getName())){
                cookie.setValue("uadmin");
            }
        }
        HttpServletResponse response = (HttpServletResponse) resp;
        CookieUtils.setCookie(response,"theme","uadmin");
        chain.doFilter(request, response);
    }
    @Override
    public void init(FilterConfig config) throws ServletException {

    }

}
