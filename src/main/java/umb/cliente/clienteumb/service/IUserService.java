package umb.cliente.clienteumb.service;


import umb.cliente.clienteumb.model.dto.UserDTO;


public interface IUserService {
    public UserDTO getUser(Integer id);
    public UserDTO createUser(UserDTO userDTO);
    public UserDTO updateUser(UserDTO userDTO);
    public UserDTO deleteUser(Integer Id);

    public UserDTO getUserEmail(String email);
}
