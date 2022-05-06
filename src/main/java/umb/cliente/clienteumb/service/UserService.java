package umb.cliente.clienteumb.service;


import umb.cliente.clienteumb.model.dao.UserDAO;
import umb.cliente.clienteumb.model.dto.UserDTO;
import umb.cliente.clienteumb.repository.IClientRepository;
import umb.cliente.clienteumb.repository.IUserRepository;
import umb.cliente.clienteumb.repository.UserRepository;
import umb.cliente.clienteumb.util.PasswordUtils;

public class UserService implements IUserService {
    IUserRepository iUserRepository = new UserRepository();

    @Override
    public UserDTO getUser(Integer id) {
        UserDAO userDAO = iUserRepository.getUser(id);
        return new UserDTO(userDAO);
    }

    @Override
    public UserDTO getUserEmail(String email){
        UserDAO userDAO = iUserRepository.getUserEmail(email);
        return new UserDTO(userDAO);
    }

    @Override
    public UserDTO createUser(UserDTO userDTO) {
        String salt = PasswordUtils.getSalt(30);
        String mySecurePassword = PasswordUtils.generateSecurePassword(userDTO.getPassword(), salt);
        userDTO.setPassword(mySecurePassword);
        userDTO.setSalt(salt);
        UserDAO myPassword =  iUserRepository.createUser(new UserDAO(userDTO));
        return new UserDTO(myPassword);
    }

    @Override
    public UserDTO updateUser(UserDTO userDTO) {
        return null;
    }

    @Override
    public UserDTO deleteUser(Integer Id) {
        return null;
    }
}
