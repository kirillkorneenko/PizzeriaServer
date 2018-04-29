package by.bsuir.pizzeria.beans.users;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class User {
    private Long id;
    private String login;
    private String password;
    private String name;
    private String surname;
    private String email;
    private String phone;
    private String confirmation;
    private Long idRole;

    private Role roleByIdRole;
    private Verificationtoken verificationtokenById;

    @Id
    @GeneratedValue
    @Column(name = "id", nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    @Basic
    @Column(name = "email", nullable = false, length = 50)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "phone", nullable = false, length = 50)
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Basic
    @Column(name = "confirmation", nullable = false, length = 50)
    public String getConfirmation() {
        return confirmation;
    }

    public void setConfirmation(String confirmation) {
        this.confirmation = confirmation;
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
                Objects.equals(login, user.login) &&
                Objects.equals(password, user.password) &&
                Objects.equals(name, user.name) &&
                Objects.equals(surname, user.surname) &&
                Objects.equals(email, user.email) &&
                Objects.equals(phone, user.phone) &&
                Objects.equals(confirmation, user.confirmation) &&
                Objects.equals(idRole, user.idRole) &&
                Objects.equals(roleByIdRole, user.roleByIdRole) &&
                Objects.equals(verificationtokenById, user.verificationtokenById);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, login, password, name, surname, email, phone, confirmation, idRole, roleByIdRole, verificationtokenById);
    }

    @ManyToOne
    @JoinColumn(name = "idRole", referencedColumnName = "id", nullable = false, insertable = false, updatable = false)
    @JsonIgnore
    public Role getRoleByIdRole() {
        return roleByIdRole;
    }

    public void setRoleByIdRole(Role roleByIdRole) {
        this.roleByIdRole = roleByIdRole;
    }

    @OneToOne(mappedBy = "userById")
    @JsonIgnore
    public Verificationtoken getVerificationtokenById() {
        return verificationtokenById;
    }

    public void setVerificationtokenById(Verificationtoken verificationtokenById) {
        this.verificationtokenById = verificationtokenById;
    }
}
