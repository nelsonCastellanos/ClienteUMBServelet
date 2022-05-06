package umb.cliente.clienteumb.controller;

import umb.cliente.clienteumb.repository.ClientRepository;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "clientServlet", value = "/client")
public class ClientServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Soy Cliente";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        // Hello
        RequestDispatcher requestDispatcher =request.getRequestDispatcher("/client/index.jsp");
        requestDispatcher.forward(request, response);
    }
}
