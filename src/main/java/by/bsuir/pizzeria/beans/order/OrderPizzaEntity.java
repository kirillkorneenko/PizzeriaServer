package by.bsuir.pizzeria.beans.order;

import javax.persistence.*;

@Entity
@Table(name = "order_pizza", schema = "pizzeria", catalog = "")
public class OrderPizzaEntity {
    private int id;
    private int idOrder;
    private int idPizza;
    private Integer quantity;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "idOrder", nullable = false)
    public int getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(int idOrder) {
        this.idOrder = idOrder;
    }

    @Basic
    @Column(name = "idPizza", nullable = false)
    public int getIdPizza() {
        return idPizza;
    }

    public void setIdPizza(int idPizza) {
        this.idPizza = idPizza;
    }

    @Basic
    @Column(name = "quantity", nullable = true)
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

        OrderPizzaEntity that = (OrderPizzaEntity) o;

        if (id != that.id) return false;
        if (idOrder != that.idOrder) return false;
        if (idPizza != that.idPizza) return false;
        if (quantity != null ? !quantity.equals(that.quantity) : that.quantity != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + idOrder;
        result = 31 * result + idPizza;
        result = 31 * result + (quantity != null ? quantity.hashCode() : 0);
        return result;
    }
}
