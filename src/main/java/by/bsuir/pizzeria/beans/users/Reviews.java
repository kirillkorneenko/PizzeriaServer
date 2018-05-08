package by.bsuir.pizzeria.beans.users;

import by.bsuir.pizzeria.beans.pizza.Pizza;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Reviews {
    private Long id;
    private String text;

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

                Objects.equals(text, reviews.text);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, text);
    }


}
