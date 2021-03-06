package umb.cliente.clienteumb.repository;

import umb.cliente.clienteumb.listener.LocalEntityManagerFactory;
import umb.cliente.clienteumb.model.dao.TypeIdDAO;
import umb.cliente.clienteumb.model.dao.UserDAO;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.Set;
import java.util.stream.Collectors;

public class TypeIdRepository  extends LocalEntityManagerFactory implements ITypeIdRepository{
    private final EntityManager em;

    public TypeIdRepository() {
        this.em = emf.createEntityManager();
    }
    @Override
    public Set<TypeIdDAO> getAll() {
        TypedQuery<TypeIdDAO> q = em.createQuery("SELECT b FROM TypeIdDAO b", TypeIdDAO.class);
        return q.getResultList().stream().collect(Collectors.toSet());
    }

    @Override
    public TypeIdDAO create(TypeIdDAO typeIdDAO) {
        if (typeIdDAO.getId() == null) {
            em.getTransaction().begin();
            em.persist(typeIdDAO);
            em.getTransaction().commit();
        } else {
            em.getTransaction().begin();
            typeIdDAO = em.merge(typeIdDAO);
            em.getTransaction().commit();
        }
        return typeIdDAO;
    }
}
