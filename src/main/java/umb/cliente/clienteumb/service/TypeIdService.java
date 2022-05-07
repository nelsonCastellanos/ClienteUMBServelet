package umb.cliente.clienteumb.service;

import umb.cliente.clienteumb.model.dao.TypeIdDAO;
import umb.cliente.clienteumb.repository.TypeIdRepository;

import java.util.Set;

public class TypeIdService implements ITypeIdService {
    @Override
    public Set<TypeIdDAO> getAll() {
        return new TypeIdRepository().getAll();
    }
}
