package umb.cliente.clienteumb.controller;

import umb.cliente.clienteumb.model.dto.UserDTO;
import umb.cliente.clienteumb.service.IUserService;
import umb.cliente.clienteumb.service.UserService;

import javax.persistence.NoResultException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;



@WebServlet(name = "registerServlet", value = "/register")
public class RegisterServlet extends HttpServlet {
    IUserService iUserService;

    public void init() {
        iUserService = new UserService();
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/register/index.jsp");
        requestDispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String email = request.getParameter("email");
        String path = "/register/index.jsp";
        try{
            iUserService.getUserEmail(email);
        }catch (NoResultException entityNotFoundException){
            UserDTO userDTO = new UserDTO(username, password, email);
            iUserService.createUser(userDTO);
            path = "/client/index.jsp";
        }finally {
            RequestDispatcher requestDispatcher = request.getRequestDispatcher(path);
            requestDispatcher.forward(request, response);
        }
    }
}
