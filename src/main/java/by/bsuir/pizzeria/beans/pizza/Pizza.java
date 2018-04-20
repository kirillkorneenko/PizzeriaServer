package by.bsuir.pizzeria.beans.pizza;

import by.bsuir.pizzeria.beans.users.Reviews;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
public class Pizza {
    private Long id;
    private String name;
    private Double caloricity;
    private Double price;

    private List<OrderPizza> orderPizzasById;
    private List<Reviews> reviewsById;

    private List<Ingredients> ingredients;
    private List<Sales> sales;

    @Id
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
        return Objects.equals(id, pizza.id) &&
                Objects.equals(name, pizza.name) &&
                Objects.equals(caloricity, pizza.caloricity) &&
                Objects.equals(price, pizza.price);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, name, caloricity, price);
    }

    @OneToMany(mappedBy = "pizzaByIdPizza")
    public List<OrderPizza> getOrderPizzasById() {
        return orderPizzasById;
    }

    public void setOrderPizzasById(List<OrderPizza> orderPizzasById) {
        this.orderPizzasById = orderPizzasById;
    }


    @OneToMany(mappedBy = "pizzaByIdPizza")
    public List<Reviews> getReviewsById() {
        return reviewsById;
    }

    public void setReviewsById(List<Reviews> reviewsById) {
        this.reviewsById = reviewsById;
    }


    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "pizza_ingredients",
            joinColumns = @JoinColumn(name = "idPizza"),
            inverseJoinColumns = @JoinColumn(name = "idIngredients"))
    public List<Ingredients> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Ingredients> ingredients) {
        this.ingredients = ingredients;
    }

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "sales_pizza",
            joinColumns = @JoinColumn(name = "idPizza"),
            inverseJoinColumns = @JoinColumn(name = "idSales"))
    public List<Sales> getSales() {
        return sales;
    }

    public void setSales(List<Sales> sales) {
        this.sales = sales;
    }
}
