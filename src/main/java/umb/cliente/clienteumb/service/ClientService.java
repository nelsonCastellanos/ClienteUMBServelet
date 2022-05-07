package umb.cliente.clienteumb.service;


import umb.cliente.clienteumb.model.dao.ClientDAO;
import umb.cliente.clienteumb.model.dao.UserDAO;
import umb.cliente.clienteumb.model.dto.ClientDTO;
import umb.cliente.clienteumb.model.dto.UserDTO;
import umb.cliente.clienteumb.repository.ClientRepository;
import umb.cliente.clienteumb.repository.IClientRepository;

import java.util.List;
import java.util.stream.Collectors;

public class ClientService implements IClientService{
    IClientRepository clientRepository = new ClientRepository();

    @Override
    public ClientDTO getClient(Integer id) {
        return null;
    }

    @Override
    public ClientDTO createClient(ClientDTO client) {
        ClientDAO clientDAO = new ClientDAO(client);
        return new ClientDTO(clientRepository.createClient(clientDAO));
    }

    @Override
    public ClientDTO updateClient(ClientDTO client) {
        return null;
    }

    @Override
    public ClientDTO deleteClient(Integer Id) {
        return null;
    }

    @Override
    public List<ClientDTO> getAll(UserDTO userDTO) {
        UserDAO userDAO = new UserDAO(userDTO);
        List<ClientDAO> clientDAOS = clientRepository.getAllClient(userDAO);
        return clientDAOS.stream().map(x -> new ClientDTO(x)).collect(Collectors.toList());
    }
}
