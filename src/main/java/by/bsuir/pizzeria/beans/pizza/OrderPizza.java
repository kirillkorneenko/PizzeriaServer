package by.bsuir.pizzeria.beans.pizza;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "order_pizza", schema = "pizzeria", catalog = "")
public class OrderPizza {
    private Long id;
    private Long idOrder;
    private Long idPizza;
    private Integer quantity;

    private Orders orderByIdOrders;
    private Pizza pizzaByIdPizza;
    private List<OrderPizzaSizepizza> orderPizzaSizepizzasById;
    private List<Pastry> pastries;

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

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (idOrder != null ? !idOrder.equals(that.idOrder) : that.idOrder != null) return false;
        if (idPizza != null ? !idPizza.equals(that.idPizza) : that.idPizza != null) return false;
        if (quantity != null ? !quantity.equals(that.quantity) : that.quantity != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (idOrder != null ? idOrder.hashCode() : 0);
        result = 31 * result + (idPizza != null ? idPizza.hashCode() : 0);
        result = 31 * result + (quantity != null ? quantity.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "idOrder", referencedColumnName = "id", nullable = false, insertable = false, updatable = false)
    @JsonIgnore
    public Orders getOrderByIdOrders() {
        return orderByIdOrders;
    }

    public void setOrderByIdOrders(Orders orderByIdOrders) {
        this.orderByIdOrders = orderByIdOrders;
    }

    @ManyToOne
    @JoinColumn(name = "idPizza", referencedColumnName = "id", nullable = false, insertable = false, updatable = false)
    @JsonIgnore
    public Pizza getPizzaByIdPizza() {
        return pizzaByIdPizza;
    }

    public void setPizzaByIdPizza(Pizza pizzaByIdPizza) {
        this.pizzaByIdPizza = pizzaByIdPizza;
    }

    @OneToMany(mappedBy = "orderPizzaByIdOrderPizza")
    @JsonIgnore
    public List<OrderPizzaSizepizza> getOrderPizzaSizepizzasById() {
        return orderPizzaSizepizzasById;
    }

    public void setOrderPizzaSizepizzasById(List<OrderPizzaSizepizza> orderPizzaSizepizzasById) {
        this.orderPizzaSizepizzasById = orderPizzaSizepizzasById;
    }

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name="order_pizza_pastry",
            joinColumns={@JoinColumn(name="idOrderPizza")},
            inverseJoinColumns={@JoinColumn(name="idPastry")})
    @JsonIgnore
    public List<Pastry> getPastries() {
        return pastries;
    }

    public void setPastries(List<Pastry> pastries) {
        this.pastries = pastries;
    }
}
