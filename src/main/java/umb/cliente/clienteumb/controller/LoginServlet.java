package umb.cliente.clienteumb.controller;

import umb.cliente.clienteumb.model.dto.UserDTO;
import umb.cliente.clienteumb.service.IUserService;
import umb.cliente.clienteumb.service.UserService;
import umb.cliente.clienteumb.util.PasswordUtils;

import javax.persistence.NoResultException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "loginServlet", value = "/login")
public class LoginServlet extends HttpServlet {
    IUserService iUserService;

    public void init() {
        iUserService = new UserService();
    }


    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/index.jsp");
        requestDispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        String path = "/index.jsp";
        try{
            UserDTO userDTO = iUserService.getUserEmail(email);
            boolean passwordMatch = PasswordUtils.verifyUserPassword(password, userDTO.getPassword(), userDTO.getSalt());
            if (passwordMatch) {
                path = "/client/index.jsp";
            }
        }catch (NoResultException entityNotFoundException){
            System.out.println("user not found " + email);
        }finally {
            RequestDispatcher requestDispatcher = request.getRequestDispatcher(path);
            requestDispatcher.forward(request, response);
        }
    }
}
