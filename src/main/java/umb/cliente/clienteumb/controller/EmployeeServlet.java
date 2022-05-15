package umb.cliente.clienteumb.controller;

import umb.cliente.clienteumb.model.dao.CommercialAreaDAO;
import umb.cliente.clienteumb.model.dao.TypeIdDAO;
import umb.cliente.clienteumb.model.dto.CommercialAreaDTO;
import umb.cliente.clienteumb.model.dto.EmployeeDTO;
import umb.cliente.clienteumb.model.dto.UserDTO;
import umb.cliente.clienteumb.service.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

@WebServlet(name = "employeeServlet", value = "/employee")
public class EmployeeServlet extends HttpServlet {
    IEmployeeService service;
    IUserService iUserService;
    IComercialAreaService comercialAreaService;


    public void init() {
        service = new EmployeeService();
        comercialAreaService = new ComercialAreaService();
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        List<CommercialAreaDTO> commercialAreaDTOS = comercialAreaService.getAll();
        List<EmployeeDTO> employees = service.getAll().stream().map(employeeDTO ->{
            CommercialAreaDTO comercial = commercialAreaDTOS.stream()
                 .filter(commercialAreaDTO -> commercialAreaDTO.getId() == employeeDTO.getId())
                 .collect(Collectors.toList()).get(0);
            employeeDTO.setCommercialArea(comercial);
            return employeeDTO;
        }).collect(Collectors.toList());

        request.setAttribute("employees", employees);
        request.setAttribute("commercialAreas", commercialAreaDTOS);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/employee/index.jsp");
        requestDispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession(false);

        String name = request.getParameter("employeeName");
        String lastname = request.getParameter("employeeLastName");
        String phone = request.getParameter("employeePhone");
        Integer commercialArea = Integer.valueOf(request.getParameter("employeeCommercialArea"));
        UserDTO user = (UserDTO) session.getAttribute("user");
        CommercialAreaDTO commercialAreaDTO = new CommercialAreaDTO();
        commercialAreaDTO.setId(commercialArea);
        EmployeeDTO typeIdDAO = new EmployeeDTO(
                name, lastname, phone,
                commercialAreaDTO,
                user
        );
        service.create(typeIdDAO);
        response.sendRedirect(request.getContextPath() + "/employee");
    }
}
