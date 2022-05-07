package umb.cliente.clienteumb.repository;


import umb.cliente.clienteumb.model.dao.UserDAO;

public interface IUserRepository {
    UserDAO getUser(Integer id);
    UserDAO createUser(UserDAO userDAO);
    UserDAO updateUser(UserDAO userDAO);
    void deleteUser(UserDAO userDAO);
    UserDAO getUserEmail(String email);
}
