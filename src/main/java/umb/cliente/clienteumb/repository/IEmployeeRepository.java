package umb.cliente.clienteumb.repository;

import umb.cliente.clienteumb.model.dao.EmployeeDAO;

import java.util.List;

public interface IEmployeeRepository {
    EmployeeDAO create(EmployeeDAO employee);
    List<EmployeeDAO> getAll();
}
