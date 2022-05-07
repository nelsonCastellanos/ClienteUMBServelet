package umb.cliente.clienteumb.repository;

import umb.cliente.clienteumb.model.dao.UserDAO;
import umb.cliente.clienteumb.model.dto.UserDTO;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class UserRepository implements IUserRepository {

    private final EntityManager em;

    public UserRepository() {
        this.em = Persistence.createEntityManagerFactory("default").createEntityManager();
    }

    @Override
    public UserDAO getUser(Integer id) {
        return em.find(UserDAO.class, id);
    }

    @Override
    public UserDAO createUser(UserDAO userDAO) {
        if (userDAO.getId() == null) {
            em.getTransaction().begin();
            em.persist(userDAO);
            em.getTransaction().commit();
        } else {
            em.getTransaction().begin();
            userDAO = em.merge(userDAO);
            em.getTransaction().commit();
        }
        return userDAO;
    }

    @Override
    public UserDAO updateUser(UserDAO userDAO) {
        return createUser(userDAO);
    }

    @Override
    public void deleteUser(UserDAO userDAO) {
        if (em.contains(userDAO)) {
            em.remove(userDAO);
        } else {
            em.merge(userDAO);
        }
    }

    @Override
    public UserDAO getUserEmail(String email) {
        TypedQuery<UserDAO> q = em.createQuery("SELECT b FROM UserDAO b WHERE b.email = :email", UserDAO.class);
        q.setParameter("email", email);
        return q.getSingleResult();
    }
}
