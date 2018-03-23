package by.bsuir.pizzeria.beans.order;

import javax.persistence.*;

@Entity
@Table(name = "order_yourselfpizza", schema = "pizzeria", catalog = "")
public class OrderYourselfpizzaEntity {
    private int id;
    private int idYourselfPizza;
    private int idOrder;
    private int quantity;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "idYourselfPizza", nullable = false)
    public int getIdYourselfPizza() {
        return idYourselfPizza;
    }

    public void setIdYourselfPizza(int idYourselfPizza) {
        this.idYourselfPizza = idYourselfPizza;
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
    @Column(name = "quantity", nullable = false)
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OrderYourselfpizzaEntity that = (OrderYourselfpizzaEntity) o;

        if (id != that.id) return false;
        if (idYourselfPizza != that.idYourselfPizza) return false;
        if (idOrder != that.idOrder) return false;
        if (quantity != that.quantity) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + idYourselfPizza;
        result = 31 * result + idOrder;
        result = 31 * result + quantity;
        return result;
    }
}
