package umb.cliente.clienteumb.model.dao;

import umb.cliente.clienteumb.model.dto.CommercialAreaDTO;

import javax.persistence.*;

@Entity
@Table(name = "comercial_area", schema = "umb")
public class CommercialAreaDAO {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String name;

    @Column
    private String description;


    public CommercialAreaDAO(){}
    public CommercialAreaDAO(CommercialAreaDTO commercialArea) {
        this.id = commercialArea.getId();
        this.description = commercialArea.getDescription();
        this.name = commercialArea.getName();
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
