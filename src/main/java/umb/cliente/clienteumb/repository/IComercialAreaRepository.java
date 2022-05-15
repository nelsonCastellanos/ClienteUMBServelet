package umb.cliente.clienteumb.repository;

import umb.cliente.clienteumb.model.dao.ClientDAO;
import umb.cliente.clienteumb.model.dao.CommercialAreaDAO;

import java.util.List;

public interface IComercialAreaRepository {
    CommercialAreaDAO create(CommercialAreaDAO commercialArea);
    List<CommercialAreaDAO> getAll();
}
