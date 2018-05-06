package by.bsuir.pizzeria.beans.order;

import by.bsuir.pizzeria.beans.pizza.Pastry;
import by.bsuir.pizzeria.beans.pizza.Pizza;
import by.bsuir.pizzeria.beans.pizza.Sizepizza;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "order_pizza", schema = "pizzeria", catalog = "")
public class OrderPizza {
    private Long id;
    private Long idOrder;
    private Long idPizza;
    private Long idSizePizza;
    private Long idPastry;

    private Orders ordersByIdOrder;
    private Pizza pizzaByIdPizza;
    private Sizepizza sizepizzaByIdSizePizza;
    private Pastry pastryByIdPastry;

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
    @Column(name = "idOrder", nullable = false)
    public Long getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(Long idOrder) {
        this.idOrder = idOrder;
    }

    @Basic
    @Column(name = "idPizza", nullable = false)
    public Long getIdPizza() {
        return idPizza;
    }

    public void setIdPizza(Long idPizza) {
        this.idPizza = idPizza;
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
        OrderPizza that = (OrderPizza) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(idOrder, that.idOrder) &&
                Objects.equals(idPizza, that.idPizza) &&
                Objects.equals(idSizePizza, that.idSizePizza) &&
                Objects.equals(idPastry, that.idPastry);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, idOrder, idPizza, idSizePizza, idPastry);
    }

    @ManyToOne
    @JoinColumn(name = "idOrder", referencedColumnName = "id", nullable = false, insertable = false, updatable = false)
    @JsonIgnore
    public Orders getOrdersByIdOrder() {
        return ordersByIdOrder;
    }

    public void setOrdersByIdOrder(Orders ordersByIdOrder) {
        this.ordersByIdOrder = ordersByIdOrder;
    }

    @ManyToOne
    @JoinColumn(name = "idPizza", referencedColumnName = "id", nullable = false, insertable = false, updatable = false)
    public Pizza getPizzaByIdPizza() {
        return pizzaByIdPizza;
    }

    public void setPizzaByIdPizza(Pizza pizzaByIdPizza) {
        this.pizzaByIdPizza = pizzaByIdPizza;
    }

    @ManyToOne
    @JoinColumn(name = "idSizePizza", referencedColumnName = "id", nullable = false, insertable = false, updatable = false)
    public Sizepizza getSizepizzaByIdSizePizza() {
        return sizepizzaByIdSizePizza;
    }

    public void setSizepizzaByIdSizePizza(Sizepizza sizepizzaByIdSizePizza) {
        this.sizepizzaByIdSizePizza = sizepizzaByIdSizePizza;
    }

    @ManyToOne
    @JoinColumn(name = "idPastry", referencedColumnName = "id", nullable = false, insertable = false, updatable = false)
    public Pastry getPastryByIdPastry() {
        return pastryByIdPastry;
    }

    public void setPastryByIdPastry(Pastry pastryByIdPastry) {
        this.pastryByIdPastry = pastryByIdPastry;
    }
}
