package by.bsuir.pizzeria.beans.additionalProducts;

import by.bsuir.pizzeria.beans.pizza.Order;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "order_sauce", schema = "pizzeria", catalog = "")
public class OrderSauce {
    private Long id;
    private Long idOrder;
    private Long idSauce;
    private Integer quantity;

    private Order orderByIdOrder;
    private Sauce sauceByIdSauce;

    @Id
    @Column(name = "id", nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "idOrder", nullable = false)
    public Long getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(Long idOrder) {
        this.idOrder = idOrder;
    }

    @Basic
    @Column(name = "idSauce", nullable = false)
    public Long getIdSauce() {
        return idSauce;
    }

    public void setIdSauce(Long idSauce) {
        this.idSauce = idSauce;
    }

    @Basic
    @Column(name = "quantity", nullable = false)
    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderSauce that = (OrderSauce) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(idOrder, that.idOrder) &&
                Objects.equals(idSauce, that.idSauce) &&
                Objects.equals(quantity, that.quantity);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, idOrder, idSauce, quantity);
    }

    @ManyToOne
    @JoinColumn(name = "idOrder", referencedColumnName = "id", nullable = false)
    public Order getOrderByIdOrder() {
        return orderByIdOrder;
    }

    public void setOrderByIdOrder(Order orderByIdOrder) {
        this.orderByIdOrder = orderByIdOrder;
    }

    @ManyToOne
    @JoinColumn(name = "idSauce", referencedColumnName = "id", nullable = false)
    public Sauce getSauceByIdSauce() {
        return sauceByIdSauce;
    }

    public void setSauceByIdSauce(Sauce sauceByIdSauce) {
        this.sauceByIdSauce = sauceByIdSauce;
    }
}
