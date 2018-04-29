package by.bsuir.pizzeria.beans.pizza;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name = "order_pizza_sizepizza", schema = "pizzeria", catalog = "")
public class OrderPizzaSizepizza {
    private Long id;
    private Long idOrderPizza;
    private Long idSizePizza;
    private Double weight;
    private OrderPizza orderPizzaByIdOrderPizza;
    private Sizepizza sizepizzaByIdSizePizza;

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

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (idOrderPizza != null ? !idOrderPizza.equals(that.idOrderPizza) : that.idOrderPizza != null) return false;
        if (idSizePizza != null ? !idSizePizza.equals(that.idSizePizza) : that.idSizePizza != null) return false;
        if (weight != null ? !weight.equals(that.weight) : that.weight != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (idOrderPizza != null ? idOrderPizza.hashCode() : 0);
        result = 31 * result + (idSizePizza != null ? idSizePizza.hashCode() : 0);
        result = 31 * result + (weight != null ? weight.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "idOrderPizza", referencedColumnName = "id", nullable = false, insertable = false, updatable = false)
    @JsonIgnore
    public OrderPizza getOrderPizzaByIdOrderPizza() {
        return orderPizzaByIdOrderPizza;
    }

    public void setOrderPizzaByIdOrderPizza(OrderPizza orderPizzaByIdOrderPizza) {
        this.orderPizzaByIdOrderPizza = orderPizzaByIdOrderPizza;
    }

    @ManyToOne
    @JoinColumn(name = "idSizePizza", referencedColumnName = "id", nullable = false, insertable = false, updatable = false)
    @JsonIgnore
    public Sizepizza getSizepizzaByIdSizePizza() {
        return sizepizzaByIdSizePizza;
    }

    public void setSizepizzaByIdSizePizza(Sizepizza sizepizzaByIdSizePizza) {
        this.sizepizzaByIdSizePizza = sizepizzaByIdSizePizza;
    }
}
