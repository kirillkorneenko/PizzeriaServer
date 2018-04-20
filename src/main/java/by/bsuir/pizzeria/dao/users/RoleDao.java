package by.bsuir.pizzeria.dao.users;

import by.bsuir.pizzeria.beans.users.Role;

public interface RoleDao {
    void persist( Role role);
    Role getByKey(Long id);
    void update( Role role);
    void delete( Role role);
}
