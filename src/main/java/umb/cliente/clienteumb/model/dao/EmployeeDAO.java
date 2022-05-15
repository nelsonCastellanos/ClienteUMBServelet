package umb.cliente.clienteumb.model.dao;

import umb.cliente.clienteumb.model.dto.EmployeeDTO;

import javax.persistence.*;

@Entity
@Table(name = "employee", schema = "umb")
public class EmployeeDAO {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String name;

    @Column
    private String lastname;

    @Column
    private String phone;

    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(columnDefinition="integer", name="commercial_area_id")
    private CommercialAreaDAO commercialArea;

    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private UserDAO user;

    public EmployeeDAO(){}
    public EmployeeDAO(EmployeeDTO employee) {
        this.id = employee.getId();
        this.name = employee.getName();
        this.lastname = employee.getLastname();
        this.phone = employee.getPhone();
        this.commercialArea = new CommercialAreaDAO(employee.getCommercialArea());
        this.user = new UserDAO(employee.getUser());
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

    public CommercialAreaDAO getCommercialArea() {
        return commercialArea;
    }

    public void setCommercialArea(CommercialAreaDAO commercialArea) {
        this.commercialArea = commercialArea;
    }

    public UserDAO getUser() {
        return user;
    }

    public void setUser(UserDAO user) {
        this.user = user;
    }
}
