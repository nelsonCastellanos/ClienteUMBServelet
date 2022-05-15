package umb.cliente.clienteumb.controller;

import umb.cliente.clienteumb.model.dao.CommercialAreaDAO;
import umb.cliente.clienteumb.model.dao.TypeIdDAO;
import umb.cliente.clienteumb.model.dto.CommercialAreaDTO;
import umb.cliente.clienteumb.service.ComercialAreaService;
import umb.cliente.clienteumb.service.IComercialAreaService;
import umb.cliente.clienteumb.service.ITypeIdService;
import umb.cliente.clienteumb.service.TypeIdService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "commercialAreaServlet", value = "/comercialArea")
public class CommercialAreaServlet extends HttpServlet {
    IComercialAreaService service;

    public void init() {
        service = new ComercialAreaService();
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        request.setAttribute("commercialAreas", service.getAll());
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/comercialArea/index.jsp");
        requestDispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("comercialAreaName");
        String description = request.getParameter("comercialAreaDescription");
        CommercialAreaDTO commercialAreaDTO = new CommercialAreaDTO(name, description);
        service.create(commercialAreaDTO);
        response.sendRedirect(request.getContextPath() + "/comercialArea");
    }
}
