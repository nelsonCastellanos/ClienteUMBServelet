package umb.cliente.clienteumb.repository;

import umb.cliente.clienteumb.model.dao.ClientDAO;
import umb.cliente.clienteumb.model.dao.UserDAO;
import umb.cliente.clienteumb.model.dto.ClientDTO;

import java.util.List;

public interface IClientRepository {
    ClientDAO getClient(Integer id);

    List<ClientDAO> getAllClient(UserDAO user);

    ClientDAO createClient(ClientDAO client);

    ClientDAO updateClient(ClientDAO client);

    ClientDAO deleteClient(ClientDAO Id);
}
