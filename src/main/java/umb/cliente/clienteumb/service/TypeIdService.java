package umb.cliente.clienteumb.service;

import umb.cliente.clienteumb.model.dao.TypeIdDAO;
import umb.cliente.clienteumb.repository.ITypeIdRepository;
import umb.cliente.clienteumb.repository.TypeIdRepository;

import java.util.Set;

public class TypeIdService implements ITypeIdService {
    ITypeIdRepository repository = new TypeIdRepository();
    @Override
    public Set<TypeIdDAO> getAll() {
        return repository.getAll();
    }

    @Override
    public TypeIdDAO create(TypeIdDAO typeIdDAO) {
        return repository.create(typeIdDAO);
    }
}
