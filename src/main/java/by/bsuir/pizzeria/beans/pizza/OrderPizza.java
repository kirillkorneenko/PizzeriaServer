package by.bsuir.pizzeria.beans.pizza;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "order_pizza", schema = "pizzeria", catalog = "")
public class OrderPizza {
    private Long id;
    private Long idOrder;
    private Long idPizza;
    private Integer quantity;
    private Order orderByIdOrder;
    private Pizza pizzaByIdPizza;
    private List<OrderPizzaPastry> orderPizzaPastriesById;
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
    @Column(name = "quantity", nullable = true)
    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderPizza that = (OrderPizza) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(idOrder, that.idOrder) &&
                Objects.equals(idPizza, that.idPizza) &&
                Objects.equals(quantity, that.quantity);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, idOrder, idPizza, quantity);
    }

    @ManyToOne
    @JoinColumn(name = "idOrder", referencedColumnName = "id", nullable = false)
    public Order getOrderByIdOrder() {
        return orderByIdOrder;
    }

    public void setOrderByIdOrder(Order orderByIdOrder) {
        this.orderByIdOrder = orderByIdOrder;
    }

    @ManyToOne
    @JoinColumn(name = "idPizza", referencedColumnName = "id", nullable = false)
    public Pizza getPizzaByIdPizza() {
        return pizzaByIdPizza;
    }

    public void setPizzaByIdPizza(Pizza pizzaByIdPizza) {
        this.pizzaByIdPizza = pizzaByIdPizza;
    }

    @OneToMany(mappedBy = "orderPizzaByIdOrderPizza")
    public List<OrderPizzaPastry> getOrderPizzaPastriesById() {
        return orderPizzaPastriesById;
    }

    public void setOrderPizzaPastriesById(List<OrderPizzaPastry> orderPizzaPastriesById) {
        this.orderPizzaPastriesById = orderPizzaPastriesById;
    }

    @OneToMany(mappedBy = "orderPizzaByIdOrderPizza")
    public List<OrderPizzaSizepizza> getOrderPizzaSizepizzasById() {
        return orderPizzaSizepizzasById;
    }

    public void setOrderPizzaSizepizzasById(List<OrderPizzaSizepizza> orderPizzaSizepizzasById) {
        this.orderPizzaSizepizzasById = orderPizzaSizepizzasById;
    }
}
