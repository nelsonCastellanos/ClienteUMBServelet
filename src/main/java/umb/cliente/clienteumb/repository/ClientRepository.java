package umb.cliente.clienteumb.repository;


import umb.cliente.clienteumb.listener.LocalEntityManagerFactory;
import umb.cliente.clienteumb.model.dao.ClientDAO;
import umb.cliente.clienteumb.model.dao.UserDAO;
import umb.cliente.clienteumb.model.dto.ClientDTO;
import umb.cliente.clienteumb.util.EntityManagerUtil;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import java.util.List;


public class ClientRepository extends LocalEntityManagerFactory implements IClientRepository{

    private EntityManager em;

    public ClientRepository() {
        this.em = Persistence.createEntityManagerFactory("default").createEntityManager();
    }
    @Override
    public ClientDTO getClient(Integer id) {
        return em.find(ClientDTO.class, id);
    }

    @Override
    public ClientDTO getAllClient(UserDAO user) {
        return null;
    }

    @Override
    public ClientDTO createClient(ClientDTO client) {
        return null;
    }

    @Override
    public ClientDTO updateClient(ClientDTO client) {
        return null;
    }

    @Override
    public ClientDTO deleteClient(ClientDTO Id) {
        return null;
    }
}
