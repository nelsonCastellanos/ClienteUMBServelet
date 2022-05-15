package umb.cliente.clienteumb.repository;

import umb.cliente.clienteumb.listener.LocalEntityManagerFactory;
import umb.cliente.clienteumb.model.dao.EmployeeDAO;
import umb.cliente.clienteumb.model.dao.TypeIdDAO;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class EmployeeRepository extends LocalEntityManagerFactory implements IEmployeeRepository{
    private final EntityManager em;

    public EmployeeRepository() {
        this.em = emf.createEntityManager();
    }

    @Override
    public List<EmployeeDAO> getAll() {
        TypedQuery<EmployeeDAO> q = em.createQuery("SELECT b FROM EmployeeDAO b", EmployeeDAO.class);
        return q.getResultList();
    }

    @Override
    public EmployeeDAO create(EmployeeDAO employeeDAO) {
        if (employeeDAO.getId() == null) {
            em.getTransaction().begin();
            em.persist(employeeDAO);
            em.getTransaction().commit();
        } else {
            em.getTransaction().begin();
            employeeDAO = em.merge(employeeDAO);
            em.getTransaction().commit();
        }
        return employeeDAO;
    }

}
