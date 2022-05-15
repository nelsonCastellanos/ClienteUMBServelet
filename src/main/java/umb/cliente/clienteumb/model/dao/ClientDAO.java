package umb.cliente.clienteumb.model.dao;


import umb.cliente.clienteumb.model.dto.ClientDTO;

import javax.persistence.*;

@Entity
@Table(name = "client", schema = "umb")
public class ClientDAO {
    public ClientDAO(){}
    public ClientDAO(ClientDTO client){
        this.id = client.getId();
        this.typeId = client.getTypeId();
        this.nroId = client.getNroId();
        this.name = client.getName();
        this.lastName = client.getLastName();
        this.user = client.getUser();
        this.phoneNumber = client.getPhoneNumber();
        this.email = client.getEmail();
    }

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private TypeIdDAO typeId;

    @Column
    private String nroId;

    @Column
    private  String name;

    @Column(name = "last_name")
    private String lastName;

    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private UserDAO user;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Column
    private String email;

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
