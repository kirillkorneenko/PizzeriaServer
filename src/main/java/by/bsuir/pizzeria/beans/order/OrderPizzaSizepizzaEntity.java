package by.bsuir.pizzeria.beans.order;

import javax.persistence.*;

@Entity
@Table(name = "order_pizza_sizepizza", schema = "pizzeria", catalog = "")
public class OrderPizzaSizepizzaEntity {
    private int id;
    private int idOrderPizza;
    private int idSizePizza;
    private double weight;

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
    @Column(name = "idSizePizza", nullable = false)
    public int getIdSizePizza() {
        return idSizePizza;
    }

    public void setIdSizePizza(int idSizePizza) {
        this.idSizePizza = idSizePizza;
    }

    @Basic
    @Column(name = "weight", nullable = false, precision = 0)
    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OrderPizzaSizepizzaEntity that = (OrderPizzaSizepizzaEntity) o;

        if (id != that.id) return false;
        if (idOrderPizza != that.idOrderPizza) return false;
        if (idSizePizza != that.idSizePizza) return false;
        if (Double.compare(that.weight, weight) != 0) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = id;
        result = 31 * result + idOrderPizza;
        result = 31 * result + idSizePizza;
        temp = Double.doubleToLongBits(weight);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
