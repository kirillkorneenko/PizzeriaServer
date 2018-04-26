package by.bsuir.pizzeria.beans.additionalProducts;

import by.bsuir.pizzeria.beans.pizza.Orders;

import javax.persistence.*;

@Entity
@Table(name = "order_drinkables", schema = "pizzeria", catalog = "")
public class OrderDrinkables {
    private Long id;
    private Long idOrder;
    private Long idDrinkables;
    private Integer quantity;
    private Orders orderByIdOrders;
    private Drinkables drinkablesByIdDrinkables;

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

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (idOrder != null ? !idOrder.equals(that.idOrder) : that.idOrder != null) return false;
        if (idDrinkables != null ? !idDrinkables.equals(that.idDrinkables) : that.idDrinkables != null) return false;
        if (quantity != null ? !quantity.equals(that.quantity) : that.quantity != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (idOrder != null ? idOrder.hashCode() : 0);
        result = 31 * result + (idDrinkables != null ? idDrinkables.hashCode() : 0);
        result = 31 * result + (quantity != null ? quantity.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "idOrder", referencedColumnName = "id", nullable = false, insertable = false, updatable = false)
    public Orders getOrderByIdOrders() {
        return orderByIdOrders;
    }

    public void setOrderByIdOrders(Orders orderByIdOrders) {
        this.orderByIdOrders = orderByIdOrders;
    }

    @ManyToOne
    @JoinColumn(name = "idDrinkables", referencedColumnName = "id", nullable = false, insertable = false, updatable = false)
    public Drinkables getDrinkablesByIdDrinkables() {
        return drinkablesByIdDrinkables;
    }

    public void setDrinkablesByIdDrinkables(Drinkables drinkablesByIdDrinkables) {
        this.drinkablesByIdDrinkables = drinkablesByIdDrinkables;
    }
}
