package by.bsuir.pizzeria.beans.additionalProducts;

import by.bsuir.pizzeria.beans.pizza.Order;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "order_drinkables", schema = "pizzeria", catalog = "")
public class OrderDrinkables {
    private Long id;
    private Long idOrder;
    private Long idDrinkables;
    private Integer quantity;
    private Order orderByIdOrder;
    private Drinkables drinkablesByIdDrinkables;

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
    @Column(name = "idDrinkables", nullable = false)
    public Long getIdDrinkables() {
        return idDrinkables;
    }

    public void setIdDrinkables(Long idDrinkables) {
        this.idDrinkables = idDrinkables;
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
        OrderDrinkables that = (OrderDrinkables) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(idOrder, that.idOrder) &&
                Objects.equals(idDrinkables, that.idDrinkables) &&
                Objects.equals(quantity, that.quantity);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, idOrder, idDrinkables, quantity);
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
    @JoinColumn(name = "idDrinkables", referencedColumnName = "id", nullable = false)
    public Drinkables getDrinkablesByIdDrinkables() {
        return drinkablesByIdDrinkables;
    }

    public void setDrinkablesByIdDrinkables(Drinkables drinkablesByIdDrinkables) {
        this.drinkablesByIdDrinkables = drinkablesByIdDrinkables;
    }
}
