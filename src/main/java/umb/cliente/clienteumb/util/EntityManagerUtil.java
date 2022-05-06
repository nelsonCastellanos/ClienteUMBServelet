package umb.cliente.clienteumb.util;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public abstract class EntityManagerUtil {
    protected EntityManager entityManager;

    @PersistenceContext(unitName="default")
    public void setEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
    }
}
