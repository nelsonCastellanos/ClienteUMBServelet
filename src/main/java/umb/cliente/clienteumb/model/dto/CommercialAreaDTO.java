package umb.cliente.clienteumb.model.dto;

import umb.cliente.clienteumb.model.dao.CommercialAreaDAO;

public class CommercialAreaDTO {
    private Integer id;
    private String name;
    private String description;

    public CommercialAreaDTO(){}

    public CommercialAreaDTO(CommercialAreaDAO modelComercialArea) {
        this.id = modelComercialArea.getId();
        this.name = modelComercialArea.getName();
        this.description = modelComercialArea.getDescription();
    }

    public CommercialAreaDTO(String name, String description) {
        this.name = name;
        this.description = description;
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
