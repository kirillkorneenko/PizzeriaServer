package by.bsuir.pizzeria.beans.pizza;

import by.bsuir.pizzeria.beans.additionalProducts.OrderDrinkables;
import by.bsuir.pizzeria.beans.additionalProducts.OrderSauce;
import by.bsuir.pizzeria.beans.users.Client;

import javax.persistence.*;
import java.sql.Time;
import java.util.List;
import java.util.Objects;

@Entity
public class Order {
    private Long id;
    private Long idClient;
    private String address;
    private Time orderTime;
    private Time cookingTime;
    private String comment;
    private Double totalPrice;
    private Client clientByIdClient;
    private List<OrderDrinkables> orderDrinkablesById;
    private List<OrderPizza> orderPizzasById;
    private List<OrderSauce> orderSaucesById;

    @Id
    @Column(name = "id", nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
    @Column(name = "address", nullable = false, length = 50)
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Basic
    @Column(name = "orderTime", nullable = false)
    public Time getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(Time orderTime) {
        this.orderTime = orderTime;
    }

    @Basic
    @Column(name = "cookingTime", nullable = true)
    public Time getCookingTime() {
        return cookingTime;
    }

    public void setCookingTime(Time cookingTime) {
        this.cookingTime = cookingTime;
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
    @Column(name = "totalPrice", nullable = false, precision = 0)
    public Double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return Objects.equals(id, order.id) &&
                Objects.equals(idClient, order.idClient) &&
                Objects.equals(address, order.address) &&
                Objects.equals(orderTime, order.orderTime) &&
                Objects.equals(cookingTime, order.cookingTime) &&
                Objects.equals(comment, order.comment) &&
                Objects.equals(totalPrice, order.totalPrice);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, idClient, address, orderTime, cookingTime, comment, totalPrice);
    }

    @ManyToOne
    @JoinColumn(name = "idClient", referencedColumnName = "id", nullable = false)
    public Client getClientByIdClient() {
        return clientByIdClient;
    }

    public void setClientByIdClient(Client clientByIdClient) {
        this.clientByIdClient = clientByIdClient;
    }

    @OneToMany(mappedBy = "orderByIdOrder")
    public List<OrderDrinkables> getOrderDrinkablesById() {
        return orderDrinkablesById;
    }

    public void setOrderDrinkablesById(List<OrderDrinkables> orderDrinkablesById) {
        this.orderDrinkablesById = orderDrinkablesById;
    }

    @OneToMany(mappedBy = "orderByIdOrder")
    public List<OrderPizza> getOrderPizzasById() {
        return orderPizzasById;
    }

    public void setOrderPizzasById(List<OrderPizza> orderPizzasById) {
        this.orderPizzasById = orderPizzasById;
    }

    @OneToMany(mappedBy = "orderByIdOrder")
    public List<OrderSauce> getOrderSaucesById() {
        return orderSaucesById;
    }

    public void setOrderSaucesById(List<OrderSauce> orderSaucesById) {
        this.orderSaucesById = orderSaucesById;
    }
}
