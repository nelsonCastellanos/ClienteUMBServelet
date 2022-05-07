package umb.cliente.clienteumb.service;


import umb.cliente.clienteumb.model.dto.UserDTO;


public interface IUserService {
    UserDTO getUser(Integer id);
    UserDTO createUser(UserDTO userDTO);
    UserDTO updateUser(UserDTO userDTO);
    UserDTO deleteUser(Integer Id);

    UserDTO getUserEmail(String email);
}
