package umb.cliente.clienteumb.service;

import umb.cliente.clienteumb.model.dto.CommercialAreaDTO;

import java.util.List;

public interface IComercialAreaService {
    List<CommercialAreaDTO> getAll();
    CommercialAreaDTO create(CommercialAreaDTO commercialArea);
}
