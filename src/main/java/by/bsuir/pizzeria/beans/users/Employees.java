package by.bsuir.pizzeria.beans.users;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
public class Employees {
    private Long id;
    private String name;
    private String surname;
    private List<User> usersById;

    @Id
    @Column(name = "id", nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name", nullable = false, length = 50)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "surname", nullable = false, length = 50)
    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employees employees = (Employees) o;
        return Objects.equals(id, employees.id) &&
                Objects.equals(name, employees.name) &&
                Objects.equals(surname, employees.surname);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, name, surname);
    }

    @OneToMany(mappedBy = "employeesByIdAdmin")
    public List<User> getUsersById() {
        return usersById;
    }

    public void setUsersById(List<User> usersById) {
        this.usersById = usersById;
    }
}
