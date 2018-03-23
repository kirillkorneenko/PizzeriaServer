package by.bsuir.pizzeria.beans.order;

import javax.persistence.*;

@Entity
@Table(name = "order_pizza_pastry", schema = "pizzeria", catalog = "")
public class OrderPizzaPastryEntity {
    private int id;
    private int idOrderPizza;
    private int idPastry;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "idOrderPizza", nullable = false)
    public int getIdOrderPizza() {
        return idOrderPizza;
    }

    public void setIdOrderPizza(int idOrderPizza) {
        this.idOrderPizza = idOrderPizza;
    }

    @Basic
    @Column(name = "idPastry", nullable = false)
    public int getIdPastry() {
        return idPastry;
    }

    public void setIdPastry(int idPastry) {
        this.idPastry = idPastry;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OrderPizzaPastryEntity that = (OrderPizzaPastryEntity) o;

        if (id != that.id) return false;
        if (idOrderPizza != that.idOrderPizza) return false;
        if (idPastry != that.idPastry) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + idOrderPizza;
        result = 31 * result + idPastry;
        return result;
    }
}
