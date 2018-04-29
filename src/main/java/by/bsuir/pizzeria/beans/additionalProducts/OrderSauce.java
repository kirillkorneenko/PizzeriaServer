package by.bsuir.pizzeria.beans.additionalProducts;

import by.bsuir.pizzeria.beans.pizza.Orders;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name = "order_sauce", schema = "pizzeria", catalog = "")
public class OrderSauce {
    private Long id;
    private Long idOrder;
    private Long idSauce;
    private Integer quantity;
    private Orders orderByIdOrders;
    private Sauce sauceByIdSauce;

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

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (idOrder != null ? !idOrder.equals(that.idOrder) : that.idOrder != null) return false;
        if (idSauce != null ? !idSauce.equals(that.idSauce) : that.idSauce != null) return false;
        if (quantity != null ? !quantity.equals(that.quantity) : that.quantity != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (idOrder != null ? idOrder.hashCode() : 0);
        result = 31 * result + (idSauce != null ? idSauce.hashCode() : 0);
        result = 31 * result + (quantity != null ? quantity.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "idOrder", referencedColumnName = "id", nullable = false, insertable = false, updatable = false)
    @JsonIgnore
    public Orders getOrderByIdOrders() {
        return orderByIdOrders;
    }

    public void setOrderByIdOrders(Orders orderByIdOrders) {
        this.orderByIdOrders = orderByIdOrders;
    }

    @ManyToOne
    @JoinColumn(name = "idSauce", referencedColumnName = "id", nullable = false, insertable = false, updatable = false)
    @JsonIgnore
    public Sauce getSauceByIdSauce() {
        return sauceByIdSauce;
    }

    public void setSauceByIdSauce(Sauce sauceByIdSauce) {
        this.sauceByIdSauce = sauceByIdSauce;
    }
}
