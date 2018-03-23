package by.bsuir.pizzeria.beans.componentsOfPizza;

import javax.persistence.*;

@Entity
@Table(name = "ingredients", schema = "pizzeria", catalog = "")
public class IngredientsEntity {
    private int id;
    private String name;
    private double price;
    private double caloricity;
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
    @Column(name = "name", nullable = false, length = 50)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
    @Column(name = "caloricity", nullable = false, precision = 0)
    public double getCaloricity() {
        return caloricity;
    }

    public void setCaloricity(double caloricity) {
        this.caloricity = caloricity;
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

        IngredientsEntity that = (IngredientsEntity) o;

        if (id != that.id) return false;
        if (Double.compare(that.price, price) != 0) return false;
        if (Double.compare(that.caloricity, caloricity) != 0) return false;
        if (Double.compare(that.weight, weight) != 0) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        temp = Double.doubleToLongBits(price);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(caloricity);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(weight);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
