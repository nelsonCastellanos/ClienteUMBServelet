package umb.cliente.clienteumb.service;


import umb.cliente.clienteumb.model.dto.ClientDTO;

public interface IClientService {
    public ClientDTO getClient(Integer id);
    public ClientDTO createClient(ClientDTO client);
    public ClientDTO updateClient(ClientDTO client);
    public ClientDTO deleteClient(Integer Id);
}
