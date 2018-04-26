package by.bsuir.pizzeria.beans.pizza;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class Sizepizza {
    private Long id;
    private String size;
    private Double coefficient;
    private Collection<OrderPizzaSizepizza> orderPizzaSizepizzasById;

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

        if (id != null ? !id.equals(sizepizza.id) : sizepizza.id != null) return false;
        if (size != null ? !size.equals(sizepizza.size) : sizepizza.size != null) return false;
        if (coefficient != null ? !coefficient.equals(sizepizza.coefficient) : sizepizza.coefficient != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (size != null ? size.hashCode() : 0);
        result = 31 * result + (coefficient != null ? coefficient.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "sizepizzaByIdSizePizza")
    public Collection<OrderPizzaSizepizza> getOrderPizzaSizepizzasById() {
        return orderPizzaSizepizzasById;
    }

    public void setOrderPizzaSizepizzasById(Collection<OrderPizzaSizepizza> orderPizzaSizepizzasById) {
        this.orderPizzaSizepizzasById = orderPizzaSizepizzasById;
    }
}
