package umb.cliente.clienteumb.repository;

import umb.cliente.clienteumb.model.dao.TypeIdDAO;

import java.util.Set;

public interface ITypeIdRepository {

    Set<TypeIdDAO> getAll();

    TypeIdDAO create(TypeIdDAO typeIdDAO);
}
