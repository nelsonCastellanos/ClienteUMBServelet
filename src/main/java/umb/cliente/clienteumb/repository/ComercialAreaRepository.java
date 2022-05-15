package umb.cliente.clienteumb.repository;

import umb.cliente.clienteumb.listener.LocalEntityManagerFactory;
import umb.cliente.clienteumb.model.dao.CommercialAreaDAO;
import umb.cliente.clienteumb.model.dao.TypeIdDAO;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;
import java.util.stream.Collectors;

public class ComercialAreaRepository extends LocalEntityManagerFactory implements  IComercialAreaRepository{
    private final EntityManager em;

    public ComercialAreaRepository() {
        this.em = emf.createEntityManager();
    }

    @Override
    public CommercialAreaDAO create(CommercialAreaDAO commercialArea) {
        if (commercialArea.getId() == null) {
            em.getTransaction().begin();
            em.persist(commercialArea);
            em.getTransaction().commit();
        } else {
            em.getTransaction().begin();
            commercialArea = em.merge(commercialArea);
            em.getTransaction().commit();
        }
        return commercialArea;
    }

    @Override
    public List<CommercialAreaDAO> getAll() {
        TypedQuery<CommercialAreaDAO> q = em.createQuery("SELECT b FROM CommercialAreaDAO b", CommercialAreaDAO.class);
        return q.getResultList();
    }
}
