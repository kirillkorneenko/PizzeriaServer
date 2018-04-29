package by.bsuir.pizzeria.beans.pizza;

import by.bsuir.pizzeria.beans.additionalProducts.OrderDrinkables;
import by.bsuir.pizzeria.beans.additionalProducts.OrderSauce;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.sql.Time;
import java.util.Collection;
import java.util.List;

@Entity
public class Orders {
    private Long id;
    private Long idClient;
    private String address;
    private String orderTime;
    private String cookingTime;
    private String comment;
    private Double totalPrice;
    private List<OrderDrinkables> orderDrinkablesById;
    private List<OrderPizza> orderPizzasById;
    private List<OrderSauce> orderSaucesById;

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
    public String getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(String orderTime) {
        this.orderTime = orderTime;
    }

    @Basic
    @Column(name = "cookingTime", nullable = true)
    public String getCookingTime() {
        return cookingTime;
    }

    public void setCookingTime(String cookingTime) {
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

        Orders orders = (Orders) o;

        if (id != null ? !id.equals(orders.id) : orders.id != null) return false;
        if (idClient != null ? !idClient.equals(orders.idClient) : orders.idClient != null) return false;
        if (address != null ? !address.equals(orders.address) : orders.address != null) return false;
        if (orderTime != null ? !orderTime.equals(orders.orderTime) : orders.orderTime != null) return false;
        if (cookingTime != null ? !cookingTime.equals(orders.cookingTime) : orders.cookingTime != null) return false;
        if (comment != null ? !comment.equals(orders.comment) : orders.comment != null) return false;
        if (totalPrice != null ? !totalPrice.equals(orders.totalPrice) : orders.totalPrice != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (idClient != null ? idClient.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (orderTime != null ? orderTime.hashCode() : 0);
        result = 31 * result + (cookingTime != null ? cookingTime.hashCode() : 0);
        result = 31 * result + (comment != null ? comment.hashCode() : 0);
        result = 31 * result + (totalPrice != null ? totalPrice.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "orderByIdOrders")
    @JsonIgnore
    public List<OrderDrinkables> getOrderDrinkablesById() {
        return orderDrinkablesById;
    }

    public void setOrderDrinkablesById(List<OrderDrinkables> orderDrinkablesById) {
        this.orderDrinkablesById = orderDrinkablesById;
    }

    @OneToMany(mappedBy = "orderByIdOrders")
    @JsonIgnore
    public List<OrderPizza> getOrderPizzasById() {
        return orderPizzasById;
    }

    public void setOrderPizzasById(List<OrderPizza> orderPizzasById) {
        this.orderPizzasById = orderPizzasById;
    }

    @OneToMany(mappedBy = "orderByIdOrders")
    @JsonIgnore
    public List<OrderSauce> getOrderSaucesById() {
        return orderSaucesById;
    }

    public void setOrderSaucesById(List<OrderSauce> orderSaucesById) {
        this.orderSaucesById = orderSaucesById;
    }
}
