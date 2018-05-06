package by.bsuir.pizzeria.beans.users;

import by.bsuir.pizzeria.beans.order.Orders;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
public class User {
    private Long id;
    private String login;
    private String password;
    private String name;
    private String surname;
    private String phone;
    private String email;
    private String confirmation;
    private Long idRole;

    private List<Orders> ordersById;
    private List<Reviews> reviewsById;

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
    @Column(name = "login", nullable = true, length = 50)
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    @Basic
    @Column(name = "password", nullable = true, length = 50)
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
    @Column(name = "phone", nullable = false, length = 50)
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Basic
    @Column(name = "email", nullable = true, length = 50)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "confirmation", nullable = true, length = 50)
    public String getConfirmation() {
        return confirmation;
    }

    public void setConfirmation(String confirmation) {
        this.confirmation = confirmation;
    }

    @Basic
    @Column(name = "idRole", nullable = true)
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
                Objects.equals(phone, user.phone) &&
                Objects.equals(email, user.email) &&
                Objects.equals(confirmation, user.confirmation) &&
                Objects.equals(idRole, user.idRole);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, login, password, name, surname, phone, email, confirmation, idRole);
    }

    @OneToMany(mappedBy = "userByIdClient")
    @JsonIgnore
    public List<Orders> getOrdersById() {
        return ordersById;
    }

    public void setOrdersById(List<Orders> ordersById) {
        this.ordersById = ordersById;
    }

    @OneToMany(mappedBy = "userByIdClient")
    @JsonIgnore
    public List<Reviews> getReviewsById() {
        return reviewsById;
    }

    public void setReviewsById(List<Reviews> reviewsById) {
        this.reviewsById = reviewsById;
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
