package umb.cliente.clienteumb.repository;


import umb.cliente.clienteumb.model.dao.UserDAO;

public interface IUserRepository {
    public UserDAO getUser(Integer id);
    public UserDAO createUser(UserDAO userDAO);
    public UserDAO updateUser(UserDAO userDAO);
    public void deleteUser(UserDAO userDAO);
    public UserDAO getUserEmail(String email);
}
