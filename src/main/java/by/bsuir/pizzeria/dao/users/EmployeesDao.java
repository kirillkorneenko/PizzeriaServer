package by.bsuir.pizzeria.dao.users;


import by.bsuir.pizzeria.beans.users.Employees;

public interface EmployeesDao {
    void persist( Employees employees);
    Employees getByKey(Long id);
    void update( Employees employees);
    void delete( Employees employees);
}
