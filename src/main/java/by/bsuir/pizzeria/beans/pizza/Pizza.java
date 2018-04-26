package by.bsuir.pizzeria.beans.pizza;

import by.bsuir.pizzeria.beans.users.Reviews;

import javax.persistence.*;
import java.util.Collection;
import java.util.List;

@Entity
public class Pizza {
    private Long id;
    private String name;
    private Double caloricity;
    private Double price;
    private Collection<OrderPizza> orderPizzasById;
    private Collection<Reviews> reviewsById;
    private List<Ingredients> ingredients;

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
    @Column(name = "name", nullable = false, length = 50)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "caloricity", nullable = false, precision = 0)
    public Double getCaloricity() {
        return caloricity;
    }

    public void setCaloricity(Double caloricity) {
        this.caloricity = caloricity;
    }

    @Basic
    @Column(name = "price", nullable = false, precision = 0)
    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Pizza pizza = (Pizza) o;

        if (id != null ? !id.equals(pizza.id) : pizza.id != null) return false;
        if (name != null ? !name.equals(pizza.name) : pizza.name != null) return false;
        if (caloricity != null ? !caloricity.equals(pizza.caloricity) : pizza.caloricity != null) return false;
        if (price != null ? !price.equals(pizza.price) : pizza.price != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (caloricity != null ? caloricity.hashCode() : 0);
        result = 31 * result + (price != null ? price.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "pizzaByIdPizza")
    public Collection<OrderPizza> getOrderPizzasById() {
        return orderPizzasById;
    }

    public void setOrderPizzasById(Collection<OrderPizza> orderPizzasById) {
        this.orderPizzasById = orderPizzasById;
    }

    @OneToMany(mappedBy = "pizzaByIdPizza")
    public Collection<Reviews> getReviewsById() {
        return reviewsById;
    }

    public void setReviewsById(Collection<Reviews> reviewsById) {
        this.reviewsById = reviewsById;
    }

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name="pizza_ingredients",
            joinColumns={@JoinColumn(name="idPizza")},
            inverseJoinColumns={@JoinColumn(name="idIngredients")})
    public List<Ingredients> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Ingredients> ingredients) {
        this.ingredients = ingredients;
    }


}
