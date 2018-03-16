package by.bsuir.pizzeria.connectionDB;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class ConnectionDB {

    private ConnectionDB(){}

    private static final EntityManagerFactory entityManagerFactory;

    static {
        entityManagerFactory = Persistence.createEntityManagerFactory("HIBERNATE_PERSISTENCE");
    }

    public static EntityManagerFactory getEntityManagerFactory() {
        return entityManagerFactory;
    }

    public static void shutdown() {
        getEntityManagerFactory().close();
    }

}