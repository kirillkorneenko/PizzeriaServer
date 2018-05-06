package by.bsuir.pizzeria.beans.users;

import by.bsuir.pizzeria.beans.pizza.Pizza;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Reviews {
    private Long id;
    private Long idClient;
    private Long idPizza;
    private String text;

    private User userByIdClient;
    private Pizza pizzaByIdPizza;

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
    @Column(name = "idClient", nullable = false)
    public Long getIdClient() {
        return idClient;
    }

    public void setIdClient(Long idClient) {
        this.idClient = idClient;
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
    @Column(name = "text", nullable = false, length = -1)
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Reviews reviews = (Reviews) o;
        return Objects.equals(id, reviews.id) &&
                Objects.equals(idClient, reviews.idClient) &&
                Objects.equals(idPizza, reviews.idPizza) &&
                Objects.equals(text, reviews.text);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, idClient, idPizza, text);
    }

    @ManyToOne
    @JoinColumn(name = "idClient", referencedColumnName = "id", nullable = false, insertable = false, updatable = false)
    @JsonIgnore
    public User getUserByIdClient() {
        return userByIdClient;
    }

    public void setUserByIdClient(User userByIdClient) {
        this.userByIdClient = userByIdClient;
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
}
