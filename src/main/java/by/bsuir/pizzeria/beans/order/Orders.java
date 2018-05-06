package by.bsuir.pizzeria.beans.order;

import by.bsuir.pizzeria.beans.additionalProducts.Drinkables;
import by.bsuir.pizzeria.beans.additionalProducts.Sauce;
import by.bsuir.pizzeria.beans.pizza.Pizzeria;
import by.bsuir.pizzeria.beans.users.User;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;
import java.util.Objects;

@Entity
public class Orders {
    private Long id;
    private String comment;
    private Long idClient;
    private Timestamp orderTime;
    private Double totalPrice;
    private Long idPizzeria;
    private String confirmed;
    private String paidFor;

    private List<Drinkables> drinkables;
    private List<OrderPizza> orderPizzasById;
    private List<Sauce> sauces;

    private User userByIdClient;
    private Pizzeria pizzeriaByIdPizzeria;

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
    @Column(name = "comment", nullable = false, length = -1)
    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Basic
    @Column(name = "idClient", nullable = false)
    public Long getIdClient() {
        return idClient;
    }

    public void setIdClient(Long idClient) {
        this.idClient = idClient;
    }

    @Basic
    @Column(name = "orderTime", nullable = false, length = 50)
    public Timestamp getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(Timestamp orderTime) {
        this.orderTime = orderTime;
    }

    @Basic
    @Column(name = "totalPrice", nullable = false, precision = 0)
    public Double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }

    @Basic
    @Column(name = "idPizzeria", nullable = false)
    public Long getIdPizzeria() {
        return idPizzeria;
    }

    public void setIdPizzeria(Long idPizzeria) {
        this.idPizzeria = idPizzeria;
    }

    @Basic
    @Column(name = "confirmed", nullable = false, length = 10)
    public String getConfirmed() {
        return confirmed;
    }

    public void setConfirmed(String confirmed) {
        this.confirmed = confirmed;
    }

    @Basic
    @Column(name = "paidFor", nullable = false, length = 10)
    public String getPaidFor() {
        return paidFor;
    }

    public void setPaidFor(String paidFor) {
        this.paidFor = paidFor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Orders orders = (Orders) o;
        return Objects.equals(id, orders.id) &&
                Objects.equals(comment, orders.comment) &&
                Objects.equals(idClient, orders.idClient) &&
                Objects.equals(orderTime, orders.orderTime) &&
                Objects.equals(totalPrice, orders.totalPrice) &&
                Objects.equals(idPizzeria, orders.idPizzeria) &&
                Objects.equals(confirmed, orders.confirmed) &&
                Objects.equals(paidFor, orders.paidFor);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, comment, idClient, orderTime, totalPrice, idPizzeria, confirmed, paidFor);
    }

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name="order_drinkables",
            joinColumns={@JoinColumn(name="idOrder")},
            inverseJoinColumns={@JoinColumn(name="idDrinkables")})
    public List<Drinkables> getDrinkables() {
        return drinkables;
    }

    public void setDrinkables(List<Drinkables> drinkables) {
        this.drinkables = drinkables;
    }

    @OneToMany(mappedBy = "ordersByIdOrder")
    public List<OrderPizza> getOrderPizzasById() {
        return orderPizzasById;
    }

    public void setOrderPizzasById(List<OrderPizza> orderPizzasById) {
        this.orderPizzasById = orderPizzasById;
    }

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name="order_sauce",
            joinColumns={@JoinColumn(name="idOrder")},
            inverseJoinColumns={@JoinColumn(name="idSauce")})
    public List<Sauce> getSauces() {
        return sauces;
    }

    public void setSauces(List<Sauce> sauces) {
        this.sauces = sauces;
    }

    @ManyToOne()
    @JoinColumn(name = "idClient", referencedColumnName = "id",nullable = false, insertable = false, updatable = false)
    public User getUserByIdClient() {
        return userByIdClient;
    }

    public void setUserByIdClient(User userByIdClient) {
        this.userByIdClient = userByIdClient;
    }

    @ManyToOne
    @JoinColumn(name = "idPizzeria", referencedColumnName = "id", nullable = false, insertable = false, updatable = false)
    public Pizzeria getPizzeriaByIdPizzeria() {
        return pizzeriaByIdPizzeria;
    }

    public void setPizzeriaByIdPizzeria(Pizzeria pizzeriaByIdPizzeria) {
        this.pizzeriaByIdPizzeria = pizzeriaByIdPizzeria;
    }
}
