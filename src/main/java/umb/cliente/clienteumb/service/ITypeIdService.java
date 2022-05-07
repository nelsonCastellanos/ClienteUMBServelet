package umb.cliente.clienteumb.service;

import umb.cliente.clienteumb.model.dao.TypeIdDAO;

import java.util.Set;

public interface ITypeIdService {

    Set<TypeIdDAO> getAll();
}
