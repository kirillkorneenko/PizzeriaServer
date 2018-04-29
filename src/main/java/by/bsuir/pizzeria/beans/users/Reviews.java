package by.bsuir.pizzeria.beans.users;

import by.bsuir.pizzeria.beans.pizza.Pizza;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
public class Reviews {
    private Long id;
    private Long idClient;
    private Long idPizza;
    private String text;
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

        if (id != null ? !id.equals(reviews.id) : reviews.id != null) return false;
        if (idClient != null ? !idClient.equals(reviews.idClient) : reviews.idClient != null) return false;
        if (idPizza != null ? !idPizza.equals(reviews.idPizza) : reviews.idPizza != null) return false;
        if (text != null ? !text.equals(reviews.text) : reviews.text != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (idClient != null ? idClient.hashCode() : 0);
        result = 31 * result + (idPizza != null ? idPizza.hashCode() : 0);
        result = 31 * result + (text != null ? text.hashCode() : 0);
        return result;
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
