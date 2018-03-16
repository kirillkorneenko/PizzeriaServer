package by.bsuir.pizzeria.beans;

import javax.persistence.*;

@Entity
@Table(name = "order_sauce", schema = "pizzeria", catalog = "")
public class OrderSauceEntity {
    private int id;
    private int idOrder;
    private int idSauce;
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
    @Column(name = "idOrder", nullable = false)
    public int getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(int idOrder) {
        this.idOrder = idOrder;
    }

    @Basic
    @Column(name = "idSauce", nullable = false)
    public int getIdSauce() {
        return idSauce;
    }

    public void setIdSauce(int idSauce) {
        this.idSauce = idSauce;
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

        OrderSauceEntity that = (OrderSauceEntity) o;

        if (id != that.id) return false;
        if (idOrder != that.idOrder) return false;
        if (idSauce != that.idSauce) return false;
        if (quantity != that.quantity) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + idOrder;
        result = 31 * result + idSauce;
        result = 31 * result + quantity;
        return result;
    }
}
