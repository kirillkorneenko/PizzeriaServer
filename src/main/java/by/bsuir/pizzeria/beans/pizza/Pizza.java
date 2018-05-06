package by.bsuir.pizzeria.beans.pizza;

import by.bsuir.pizzeria.beans.order.OrderPizza;
import by.bsuir.pizzeria.beans.users.Reviews;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Collection;
import java.util.List;
import java.util.Objects;

@Entity
public class Pizza {
    private Long id;
    private String name;
    private Double caloricity;
    private Double price;
    private String urlImg;
    private String description;

    private Collection<OrderPizza> orderPizzasById;
    private List<Ingredients> ingredients;
    private Collection<Reviews> reviewsById;

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

    @Basic
    @Column(name = "urlImg", nullable = false, length = 50)
    public String getUrlImg() {
        return urlImg;
    }

    public void setUrlImg(String urlImg) {
        this.urlImg = urlImg;
    }

    @Basic
    @Column(name = "description", nullable = false, length = -1)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pizza pizza = (Pizza) o;
        return Objects.equals(id, pizza.id) &&
                Objects.equals(name, pizza.name) &&
                Objects.equals(caloricity, pizza.caloricity) &&
                Objects.equals(price, pizza.price) &&
                Objects.equals(urlImg, pizza.urlImg) &&
                Objects.equals(description, pizza.description);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, name, caloricity, price, urlImg, description);
    }

    @OneToMany(mappedBy = "pizzaByIdPizza")
    @JsonIgnore
    public Collection<OrderPizza> getOrderPizzasById() {
        return orderPizzasById;
    }

    public void setOrderPizzasById(Collection<OrderPizza> orderPizzasById) {
        this.orderPizzasById = orderPizzasById;
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

    @OneToMany(mappedBy = "pizzaByIdPizza")
    @JsonIgnore
    public Collection<Reviews> getReviewsById() {
        return reviewsById;
    }

    public void setReviewsById(Collection<Reviews> reviewsById) {
        this.reviewsById = reviewsById;
    }
}
