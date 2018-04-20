package by.bsuir.pizzeria.beans.pizza;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Ingredients {
    private Long id;
    private String name;
    private Double price;
    private Double caloricity;
    private Double weight;


    @Id
    @Column(name = "id", nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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
    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Basic
    @Column(name = "caloricity", nullable = false, precision = 0)
    public Double getCaloricity() {
        return caloricity;
    }

    public void setCaloricity(Double caloricity) {
        this.caloricity = caloricity;
    }

    @Basic
    @Column(name = "weight", nullable = false, precision = 0)
    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ingredients that = (Ingredients) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(name, that.name) &&
                Objects.equals(price, that.price) &&
                Objects.equals(caloricity, that.caloricity) &&
                Objects.equals(weight, that.weight);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, name, price, caloricity, weight);
    }


}
