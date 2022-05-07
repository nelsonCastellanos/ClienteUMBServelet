package umb.cliente.clienteumb.model.dto;


import umb.cliente.clienteumb.model.dao.ClientDAO;
import umb.cliente.clienteumb.model.dao.TypeIdDAO;
import umb.cliente.clienteumb.model.dao.UserDAO;

public class ClientDTO {
    private Integer id;
    private TypeIdDAO typeId;
    private String nroId;
    private  String name;
    private String lastName;
    private UserDAO user;
    private String phoneNumber;
    private String email;

    public ClientDTO(Integer id,TypeIdDAO typeId, String nroId, String name, String lastName, UserDAO user, String phoneNumber, String email) {
        this.id = id;
        this.typeId = typeId;
        this.nroId = nroId;
        this.name = name;
        this.lastName = lastName;
        this.user = user;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public ClientDTO(ClientDAO clientDAO){
        this.id = clientDAO.getId();
        this.typeId = clientDAO.getTypeId();
        this.nroId = clientDAO.getNroId();
        this.name = clientDAO.getName();
        this.lastName = clientDAO.getLastName();
        this.user = clientDAO.getUser();
        this.phoneNumber = clientDAO.getPhoneNumber();
        this.email = clientDAO.getEmail();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public TypeIdDAO getTypeId() {
        return typeId;
    }

    public void setTypeId(TypeIdDAO typeId) {
        this.typeId = typeId;
    }

    public String getNroId() {
        return nroId;
    }

    public void setNroId(String nroId) {
        this.nroId = nroId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public UserDAO getUser() {
        return user;
    }

    public void setUser(UserDAO user) {
        this.user = user;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
