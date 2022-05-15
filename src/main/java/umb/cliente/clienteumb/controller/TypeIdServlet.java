package umb.cliente.clienteumb.controller;

import umb.cliente.clienteumb.model.dao.TypeIdDAO;
import umb.cliente.clienteumb.model.dto.UserDTO;
import umb.cliente.clienteumb.service.ITypeIdService;
import umb.cliente.clienteumb.service.IUserService;
import umb.cliente.clienteumb.service.TypeIdService;
import umb.cliente.clienteumb.service.UserService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "typeidsServlet", value = "/typeIds")
public class TypeIdServlet extends HttpServlet {
    ITypeIdService iTypeIdService;

    public void init() {
        iTypeIdService = new TypeIdService();
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        request.setAttribute("typeIds", iTypeIdService.getAll());
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/typeIds/index.jsp");
        requestDispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("typeIdName");
        String description = request.getParameter("typeIdDescription");
        TypeIdDAO typeIdDAO = new TypeIdDAO(name, description);
        iTypeIdService.create(typeIdDAO);
        response.sendRedirect(request.getContextPath() + "/typeIds");
    }
}
