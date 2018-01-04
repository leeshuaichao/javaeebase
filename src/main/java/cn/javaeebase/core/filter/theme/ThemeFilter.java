/**
 * @author 李帅超
 * @Description: TODO
 * @date 2018-01-04 10:42
 */
@javax.servlet.annotation.WebFilter(filterName = "ThemeFilter")
public class ThemeFilter implements javax.servlet.Filter {
    public void destroy() {
    }

    public void doFilter(javax.servlet.ServletRequest req, javax.servlet.ServletResponse resp, javax.servlet.FilterChain chain) throws javax.servlet.ServletException, java.io.IOException {
        chain.doFilter(req, resp);
    }

    public void init(javax.servlet.FilterConfig config) throws javax.servlet.ServletException {

    }

}
