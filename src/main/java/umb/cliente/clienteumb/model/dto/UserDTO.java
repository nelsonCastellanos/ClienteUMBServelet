package umb.cliente.clienteumb.model.dto;


import umb.cliente.clienteumb.model.dao.UserDAO;

public class UserDTO {
    private Integer id;
    private String username;
    private String email;
    private String password;

    private String salt;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public UserDTO(UserDAO userDAO) {
        this.id = userDAO.getId();
        this.email = userDAO.getEmail();
        this.password = userDAO.getPassword();
        this.username = userDAO.getUsername();
        this.salt = userDAO.getSalt();
    }

    public UserDTO(String username, String password, String email) {
        this.email = email;
        this.password = password;
        this.username = username;
    }


}
