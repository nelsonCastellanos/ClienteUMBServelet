package umb.cliente.clienteumb.service;

import umb.cliente.clienteumb.model.dao.CommercialAreaDAO;
import umb.cliente.clienteumb.model.dto.CommercialAreaDTO;
import umb.cliente.clienteumb.repository.ComercialAreaRepository;
import umb.cliente.clienteumb.repository.IComercialAreaRepository;

import java.util.List;
import java.util.stream.Collectors;

public class ComercialAreaService implements IComercialAreaService {
    IComercialAreaRepository repository = new ComercialAreaRepository();

    @Override
    public List<CommercialAreaDTO> getAll() {
        return repository.getAll().stream()
                .map(commercialArea -> new CommercialAreaDTO(commercialArea))
                .collect(Collectors.toList());
    }

    @Override
    public CommercialAreaDTO create(CommercialAreaDTO commercialArea) {
        CommercialAreaDAO modelComercialArea = new CommercialAreaDAO(commercialArea);
        repository.create(modelComercialArea);
        return new CommercialAreaDTO(modelComercialArea);
    }
}
