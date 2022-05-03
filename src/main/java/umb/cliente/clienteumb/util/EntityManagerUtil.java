package umb.cliente.clienteumb.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerUtil {
    public static EntityManager getEntityManager(){
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("default");
        EntityManager manager = factory.createEntityManager();
        return manager;
    }

    public static void main(String[] args) {
        EntityManager manager = EntityManagerUtil.getEntityManager();
        System.out.println("EntityManager class ==> " + manager.getClass().getCanonicalName());
    }
}
