package by.bsuir.pizzeria.beans.pizza;

import by.bsuir.pizzeria.beans.order.OrderPizza;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Collection;
import java.util.List;
import java.util.Objects;

@Entity
public class Pastry {
    private Long id;
    private String kind;
    private Double price;
    private Double caloricity;

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
    @Column(name = "kind", nullable = false, length = 50)
    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pastry pastry = (Pastry) o;
        return Objects.equals(id, pastry.id) &&
                Objects.equals(kind, pastry.kind) &&
                Objects.equals(price, pastry.price) &&
                Objects.equals(caloricity, pastry.caloricity);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, kind, price, caloricity);
    }

    @OneToMany(mappedBy = "pastryByIdPastry")
    @JsonIgnore
    public List<OrderPizza> getOrderPizzasById() {
        return orderPizzasById;
    }

    public void setOrderPizzasById(List<OrderPizza> orderPizzasById) {
        this.orderPizzasById = orderPizzasById;
    }
}
