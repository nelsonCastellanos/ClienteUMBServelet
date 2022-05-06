package umb.cliente.clienteumb.repository;

import umb.cliente.clienteumb.model.dao.UserDAO;
import umb.cliente.clienteumb.model.dto.ClientDTO;

public interface IClientRepository {
    public ClientDTO getClient(Integer id);

    public ClientDTO getAllClient(UserDAO user);

    public ClientDTO createClient(ClientDTO client);

    public ClientDTO updateClient(ClientDTO client);

    public ClientDTO deleteClient(ClientDTO Id);
}
