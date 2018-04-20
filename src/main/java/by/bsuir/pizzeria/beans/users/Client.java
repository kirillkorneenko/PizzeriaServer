package by.bsuir.pizzeria.beans.users;

import by.bsuir.pizzeria.beans.pizza.Order;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
public class Client {
    private Long id;
    private String name;
    private String surname;
    private String phone;
    private String email;
    private List<Order> ordersById;
    private List<Reviews> reviewsById;
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

    @Basic
    @Column(name = "phone", nullable = false, length = 50)
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Basic
    @Column(name = "email", nullable = false, length = 50)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return Objects.equals(id, client.id) &&
                Objects.equals(name, client.name) &&
                Objects.equals(surname, client.surname) &&
                Objects.equals(phone, client.phone) &&
                Objects.equals(email, client.email);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, name, surname, phone, email);
    }

    @OneToMany(mappedBy = "clientByIdClient")
    public List<Order> getOrdersById() {
        return ordersById;
    }

    public void setOrdersById(List<Order> ordersById) {
        this.ordersById = ordersById;
    }

    @OneToMany(mappedBy = "clientByIdClient")
    public List<Reviews> getReviewsById() {
        return reviewsById;
    }

    public void setReviewsById(List<Reviews> reviewsById) {
        this.reviewsById = reviewsById;
    }

    @OneToMany(mappedBy = "clientByIdUser")
    public List<User> getUsersById() {
        return usersById;
    }

    public void setUsersById(List<User> usersById) {
        this.usersById = usersById;
    }
}
