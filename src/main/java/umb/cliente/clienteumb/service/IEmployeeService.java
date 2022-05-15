package umb.cliente.clienteumb.service;

import umb.cliente.clienteumb.model.dto.EmployeeDTO;

import java.util.List;

public interface IEmployeeService {
    EmployeeDTO create(EmployeeDTO employee);
    List<EmployeeDTO> getAll();
}
