package umb.cliente.clienteumb.model.dto;

import umb.cliente.clienteumb.model.dao.CommercialAreaDAO;
import umb.cliente.clienteumb.model.dao.EmployeeDAO;
import umb.cliente.clienteumb.model.dao.UserDAO;

public class EmployeeDTO {
    private Integer id;
    private String name;
    private String lastname;
    private String phone;
    private CommercialAreaDTO commercialArea;
    private UserDTO user;

    public EmployeeDTO(EmployeeDAO employeeDAO) {
        this.id = employeeDAO.getId();
        this.name = employeeDAO.getName();
        this.lastname = employeeDAO.getLastname();
        this.phone = employeeDAO.getPhone();
        this.commercialArea = new CommercialAreaDTO(employeeDAO.getCommercialArea());
        this.user = new UserDTO(employeeDAO.getUser());
    }

    public EmployeeDTO(String name, String lastname, String phone, CommercialAreaDTO commercialAreaDTO, UserDTO user) {
        this.name = name;
        this.lastname = lastname;
        this.phone = phone;
        this.commercialArea = commercialAreaDTO;
        this.user = user;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public CommercialAreaDTO getCommercialArea() {
        return commercialArea;
    }

    public void setCommercialArea(CommercialAreaDTO commercialArea) {
        this.commercialArea = commercialArea;
    }

    public UserDTO getUser() {
        return user;
    }

    public void setUser(UserDTO user) {
        this.user = user;
    }
}
