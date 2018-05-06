package by.bsuir.pizzeria.beans.pizza;

import by.bsuir.pizzeria.beans.order.OrderPizza;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
public class Sizepizza {
    private Long id;
    private String size;
    private Double coefficient;

    private List<OrderPizza> orderPizzasById;

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
    @Column(name = "size", nullable = false, length = 50)
    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Basic
    @Column(name = "coefficient", nullable = false, precision = 0)
    public Double getCoefficient() {
        return coefficient;
    }

    public void setCoefficient(Double coefficient) {
        this.coefficient = coefficient;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sizepizza sizepizza = (Sizepizza) o;
        return Objects.equals(id, sizepizza.id) &&
                Objects.equals(size, sizepizza.size) &&
                Objects.equals(coefficient, sizepizza.coefficient);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, size, coefficient);
    }

    @OneToMany(mappedBy = "sizepizzaByIdSizePizza")
    @JsonIgnore
    public List<OrderPizza> getOrderPizzasById() {
        return orderPizzasById;
    }

    public void setOrderPizzasById(List<OrderPizza> orderPizzasById) {
        this.orderPizzasById = orderPizzasById;
    }
}
