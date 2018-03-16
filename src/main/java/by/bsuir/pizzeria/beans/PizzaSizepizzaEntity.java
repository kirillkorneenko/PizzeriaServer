package by.bsuir.pizzeria.beans;

import javax.persistence.*;

@Entity
@Table(name = "pizza_sizepizza", schema = "pizzeria", catalog = "")
public class PizzaSizepizzaEntity {
    private int id;
    private int idPizza;
    private int idSizePizza;
    private double price;
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
    @Column(name = "idPizza", nullable = false)
    public int getIdPizza() {
        return idPizza;
    }

    public void setIdPizza(int idPizza) {
        this.idPizza = idPizza;
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
    @Column(name = "price", nullable = false, precision = 0)
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
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

        PizzaSizepizzaEntity that = (PizzaSizepizzaEntity) o;

        if (id != that.id) return false;
        if (idPizza != that.idPizza) return false;
        if (idSizePizza != that.idSizePizza) return false;
        if (Double.compare(that.price, price) != 0) return false;
        if (Double.compare(that.weight, weight) != 0) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = id;
        result = 31 * result + idPizza;
        result = 31 * result + idSizePizza;
        temp = Double.doubleToLongBits(price);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(weight);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
