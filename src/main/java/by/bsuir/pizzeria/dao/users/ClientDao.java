package by.bsuir.pizzeria.dao.users;

import by.bsuir.pizzeria.beans.users.Client;

public interface ClientDao {
    void persist( Client client);
    Client getByKey(Long id);
    void update( Client client);
    void delete( Client client);
}
