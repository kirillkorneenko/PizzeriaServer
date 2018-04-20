package by.bsuir.pizzeria.beans.pizza;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "order_pizza_pastry", schema = "pizzeria", catalog = "")
public class OrderPizzaPastry {
    private Long idOrderPizza;
    private Long idPastry;
    private OrderPizza orderPizzaByIdOrderPizza;
    private Pastry pastryByIdPastry;

    @Basic
    @Column(name = "idOrderPizza", nullable = false)
    public Long getIdOrderPizza() {
        return idOrderPizza;
    }

    public void setIdOrderPizza(Long idOrderPizza) {
        this.idOrderPizza = idOrderPizza;
    }

    @Basic
    @Column(name = "idPastry", nullable = false)
    public Long getIdPastry() {
        return idPastry;
    }

    public void setIdPastry(Long idPastry) {
        this.idPastry = idPastry;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderPizzaPastry that = (OrderPizzaPastry) o;
        return Objects.equals(idOrderPizza, that.idOrderPizza) &&
                Objects.equals(idPastry, that.idPastry);
    }

    @Override
    public int hashCode() {

        return Objects.hash(idOrderPizza, idPastry);
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
    @JoinColumn(name = "idPastry", referencedColumnName = "id", nullable = false)
    public Pastry getPastryByIdPastry() {
        return pastryByIdPastry;
    }

    public void setPastryByIdPastry(Pastry pastryByIdPastry) {
        this.pastryByIdPastry = pastryByIdPastry;
    }
}
