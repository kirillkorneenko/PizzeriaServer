package by.bsuir.pizzeria.beans.users;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class User {
    private Long id;
    private Long idAdmin;
    private Long idUser;
    private String login;
    private String password;
    private Long idRole;
    private Employees employeesByIdAdmin;
    private Client clientByIdUser;
    private Role roleByIdRole;

    @Id
    @Column(name = "id", nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "idAdmin", nullable = true)
    public Long getIdAdmin() {
        return idAdmin;
    }

    public void setIdAdmin(Long idAdmin) {
        this.idAdmin = idAdmin;
    }

    @Basic
    @Column(name = "idUser", nullable = true)
    public Long getIdUser() {
        return idUser;
    }

    public void setIdUser(Long idUser) {
        this.idUser = idUser;
    }

    @Basic
    @Column(name = "login", nullable = false, length = 50)
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    @Basic
    @Column(name = "password", nullable = false, length = 50)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "idRole", nullable = false)
    public Long getIdRole() {
        return idRole;
    }

    public void setIdRole(Long idRole) {
        this.idRole = idRole;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(id, user.id) &&
                Objects.equals(idAdmin, user.idAdmin) &&
                Objects.equals(idUser, user.idUser) &&
                Objects.equals(login, user.login) &&
                Objects.equals(password, user.password) &&
                Objects.equals(idRole, user.idRole);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, idAdmin, idUser, login, password, idRole);
    }

    @ManyToOne
    @JoinColumn(name = "idAdmin", referencedColumnName = "id")
    public Employees getEmployeesByIdAdmin() {
        return employeesByIdAdmin;
    }

    public void setEmployeesByIdAdmin(Employees employeesByIdAdmin) {
        this.employeesByIdAdmin = employeesByIdAdmin;
    }

    @ManyToOne
    @JoinColumn(name = "idUser", referencedColumnName = "id")
    public Client getClientByIdUser() {
        return clientByIdUser;
    }

    public void setClientByIdUser(Client clientByIdUser) {
        this.clientByIdUser = clientByIdUser;
    }

    @ManyToOne
    @JoinColumn(name = "idRole", referencedColumnName = "id", nullable = false)
    public Role getRoleByIdRole() {
        return roleByIdRole;
    }

    public void setRoleByIdRole(Role roleByIdRole) {
        this.roleByIdRole = roleByIdRole;
    }
}
