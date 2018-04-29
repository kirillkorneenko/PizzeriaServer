package by.bsuir.pizzeria.dao.users;

import by.bsuir.pizzeria.beans.users.Role;
import by.bsuir.pizzeria.dao.AbstractDao;
import org.springframework.stereotype.Repository;

@Repository
public class RoleDaoImpl extends AbstractDao<Long, Role> implements RoleDao {
}
