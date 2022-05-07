package umb.cliente.clienteumb.service;


import umb.cliente.clienteumb.model.dto.ClientDTO;
import umb.cliente.clienteumb.model.dto.UserDTO;

import java.util.List;

public interface IClientService {
    ClientDTO getClient(Integer id);
    ClientDTO createClient(ClientDTO client);
    ClientDTO updateClient(ClientDTO client);
    ClientDTO deleteClient(Integer Id);
    List<ClientDTO> getAll(UserDTO userDTO);
}
