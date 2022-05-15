package umb.cliente.clienteumb.service;

import umb.cliente.clienteumb.model.dao.EmployeeDAO;
import umb.cliente.clienteumb.model.dto.EmployeeDTO;
import umb.cliente.clienteumb.repository.EmployeeRepository;
import umb.cliente.clienteumb.repository.IEmployeeRepository;

import java.util.List;
import java.util.stream.Collectors;

public class EmployeeService implements IEmployeeService {
    IEmployeeRepository repository = new EmployeeRepository();
    @Override
    public EmployeeDTO create(EmployeeDTO employee) {
        EmployeeDAO employeeDAO = new EmployeeDAO(employee);
        repository.create(employeeDAO);
        return new EmployeeDTO(employeeDAO);
    }

    @Override
    public List<EmployeeDTO> getAll() {
        return repository.getAll().stream().
                map(employeeDAO -> new EmployeeDTO(employeeDAO))
                .collect(Collectors.toList());
    }
}
