package umb.cliente.clienteumb.filter;


import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Arrays;

@WebFilter("/*")
public class AuthenticationFilter implements Filter {

    @Override
    public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws ServletException, IOException {
        String loginPath = "/login";
        HttpServletRequest request = (HttpServletRequest) req;
        HttpServletResponse response = (HttpServletResponse) res;

        if(request.getRequestURI().matches(".*(css|jpg|png|gif|js)")){
            chain.doFilter(request, response);
            return;
        }

        HttpSession session = request.getSession(false);
        String context  = request.getContextPath();
        String[] whiteList = {context+loginPath, context+"/register"};

        boolean loggedIn = session != null && session.getAttribute("user") != null;
        boolean authRequest =  Arrays.asList(whiteList).contains(request.getRequestURI());

        if (loggedIn || authRequest) {
            chain.doFilter(request, response);
        } else {
            request.setAttribute("message", "You must login before continuing.");
            response.sendRedirect(context+loginPath);
        }
    }
}

