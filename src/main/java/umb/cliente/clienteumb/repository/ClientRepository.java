package umb.cliente.clienteumb.repository;


import umb.cliente.clienteumb.listener.LocalEntityManagerFactory;
import umb.cliente.clienteumb.model.dao.ClientDAO;
import umb.cliente.clienteumb.model.dao.TypeIdDAO;
import umb.cliente.clienteumb.model.dao.UserDAO;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;
import java.util.stream.Collectors;


public class ClientRepository extends LocalEntityManagerFactory implements IClientRepository{

    private final EntityManager em;

    public ClientRepository() {
        this.em = emf.createEntityManager();
    }
    @Override
    public ClientDAO getClient(Integer id) {
        return em.find(ClientDAO.class, id);
    }

    @Override
    public List<ClientDAO> getAllClient(UserDAO user) {
        TypedQuery<ClientDAO> q = em.createQuery("SELECT b FROM ClientDAO b WHERE b.user = :user", ClientDAO.class);
        q.setParameter("user", user);
        return q.getResultList();
    }

    @Override
    public ClientDAO createClient(ClientDAO client) {
        if (client.getId() == null) {
            em.getTransaction().begin();
            em.persist(client);
            em.getTransaction().commit();
        } else {
            em.getTransaction().begin();
            client = em.merge(client);
            em.getTransaction().commit();
        }
        return client;
    }

    @Override
    public ClientDAO updateClient(ClientDAO client) {
        return null;
    }

    @Override
    public ClientDAO deleteClient(ClientDAO Id) {
        return null;
    }
}
