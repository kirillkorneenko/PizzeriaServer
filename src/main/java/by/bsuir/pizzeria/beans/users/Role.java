package by.bsuir.pizzeria.beans.users;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
public class Role {
    private Long id;
    private Long name;

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
    @Column(name = "name", nullable = false)
    public Long getName() {
        return name;
    }

    public void setName(Long name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Role role = (Role) o;
        return Objects.equals(id, role.id) &&
                Objects.equals(name, role.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, name);
    }

    @OneToMany(mappedBy = "roleByIdRole")
    public List<User> getUsersById() {
        return usersById;
    }

    public void setUsersById(List<User> usersById) {
        this.usersById = usersById;
    }
}
