package by.bsuir.pizzeria.beans.pizza;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
public class SizePizza {
    private Long id;
    private String size;
    private Double coefficient;
    private List<OrderPizzaSizepizza> orderPizzaSizepizzasById;

    @Id
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
        SizePizza sizePizza = (SizePizza) o;
        return Objects.equals(id, sizePizza.id) &&
                Objects.equals(size, sizePizza.size) &&
                Objects.equals(coefficient, sizePizza.coefficient);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, size, coefficient);
    }

    @OneToMany(mappedBy = "sizepizzaByIdSizePizza")
    public List<OrderPizzaSizepizza> getOrderPizzaSizepizzasById() {
        return orderPizzaSizepizzasById;
    }

    public void setOrderPizzaSizepizzasById(List<OrderPizzaSizepizza> orderPizzaSizepizzasById) {
        this.orderPizzaSizepizzasById = orderPizzaSizepizzasById;
    }
}
