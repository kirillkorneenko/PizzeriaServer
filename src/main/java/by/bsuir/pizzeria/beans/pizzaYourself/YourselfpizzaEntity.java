package by.bsuir.pizzeria.beans.pizzaYourself;

import javax.persistence.*;

@Entity
@Table(name = "yourselfpizza", schema = "pizzeria", catalog = "")
public class YourselfpizzaEntity {
    private int id;
    private double weight;
    private double price;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "weight", nullable = false, precision = 0)
    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Basic
    @Column(name = "price", nullable = false, precision = 0)
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        YourselfpizzaEntity that = (YourselfpizzaEntity) o;

        if (id != that.id) return false;
        if (Double.compare(that.weight, weight) != 0) return false;
        if (Double.compare(that.price, price) != 0) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = id;
        temp = Double.doubleToLongBits(weight);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(price);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
