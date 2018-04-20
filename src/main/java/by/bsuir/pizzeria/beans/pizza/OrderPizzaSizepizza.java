package by.bsuir.pizzeria.beans.pizza;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "order_pizza_sizepizza", schema = "pizzeria", catalog = "")
public class OrderPizzaSizepizza {
    private Long id;
    private Long idOrderPizza;
    private Long idSizePizza;
    private Double weight;

    private OrderPizza orderPizzaByIdOrderPizza;
    private SizePizza sizePizzaByIdSizePizza;

    @Id
    @Column(name = "id", nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "idOrderPizza", nullable = false)
    public Long getIdOrderPizza() {
        return idOrderPizza;
    }

    public void setIdOrderPizza(Long idOrderPizza) {
        this.idOrderPizza = idOrderPizza;
    }

    @Basic
    @Column(name = "idSizePizza", nullable = false)
    public Long getIdSizePizza() {
        return idSizePizza;
    }

    public void setIdSizePizza(Long idSizePizza) {
        this.idSizePizza = idSizePizza;
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
        OrderPizzaSizepizza that = (OrderPizzaSizepizza) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(idOrderPizza, that.idOrderPizza) &&
                Objects.equals(idSizePizza, that.idSizePizza) &&
                Objects.equals(weight, that.weight);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, idOrderPizza, idSizePizza, weight);
    }

    @ManyToOne
    @JoinColumn(name = "idOrderPizza", referencedColumnName = "id", nullable = false)
    public OrderPizza getOrderPizzaByIdOrderPizza() {
        return orderPizzaByIdOrderPizza;
    }

    public void setOrderPizzaByIdOrderPizza(OrderPizza orderPizzaByIdOrderPizza) {
        this.orderPizzaByIdOrderPizza = orderPizzaByIdOrderPizza;
    }

    @ManyToOne
    @JoinColumn(name = "idSizePizza", referencedColumnName = "id", nullable = false)
    public SizePizza getSizePizzaByIdSizePizza() {
        return sizePizzaByIdSizePizza;
    }

    public void setSizePizzaByIdSizePizza(SizePizza sizePizzaByIdSizePizza) {
        this.sizePizzaByIdSizePizza = sizePizzaByIdSizePizza;
    }
}
