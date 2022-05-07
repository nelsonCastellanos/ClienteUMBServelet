package umb.cliente.clienteumb.controller;

import umb.cliente.clienteumb.model.dao.TypeIdDAO;
import umb.cliente.clienteumb.model.dao.UserDAO;
import umb.cliente.clienteumb.model.dto.ClientDTO;
import umb.cliente.clienteumb.model.dto.UserDTO;
import umb.cliente.clienteumb.repository.ClientRepository;
import umb.cliente.clienteumb.service.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "clientServlet", value = "/client")
public class ClientServlet extends HttpServlet {
    ITypeIdService iTypeIdService;
    IClientService iClientService;

    public void init() {
        iTypeIdService = new TypeIdService();
        iClientService = new ClientService();
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        HttpSession session = request.getSession(false);
        UserDTO user = (UserDTO)session.getAttribute("user");
        request.setAttribute("typeIds", iTypeIdService.getAll());
        request.setAttribute("clients", iClientService.getAll(user));
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/client/index.jsp");
        requestDispatcher.forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String typeId = request.getParameter("typeId");
        String nroId = request.getParameter("nroId");
        String name = request.getParameter("name");
        String lastName = request.getParameter("lastName");
        String phoneNumber = request.getParameter("phoneNumber");
        String email = request.getParameter("email");

        HttpSession session = request.getSession(false);
        UserDTO asd = (UserDTO)session.getAttribute("user");
        TypeIdDAO typeIdDAO = new TypeIdDAO(Integer.parseInt(typeId), null, null);
        UserDAO user = new UserDAO(asd);

        ClientDTO clientDTO = new ClientDTO(null, typeIdDAO, nroId, name, lastName,  user, phoneNumber, email);
        iClientService.createClient(clientDTO);

        response.sendRedirect(request.getContextPath() + "/client");
    }
}
