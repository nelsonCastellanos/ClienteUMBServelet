package umb.cliente.clienteumb.repository;


import umb.cliente.clienteumb.model.dto.UserDTO;

public interface IUseRepository {
    public UserDTO getUser(Integer id);
    public UserDTO createUser(UserDTO client);
    public UserDTO updateUser(UserDTO client);
    public UserDTO deleteUser(Integer Id);
}
