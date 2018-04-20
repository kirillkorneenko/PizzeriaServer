package by.bsuir.pizzeria.beans.pizza;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
public class Pastry {
    private Long id;
    private String kind;
    private List<OrderPizzaPastry> orderPizzaPastriesById;

    @Id
    @Column(name = "id", nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "kind", nullable = false, length = 50)
    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pastry pastry = (Pastry) o;
        return Objects.equals(id, pastry.id) &&
                Objects.equals(kind, pastry.kind);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, kind);
    }

    @OneToMany(mappedBy = "pastryByIdPastry")
    public List<OrderPizzaPastry> getOrderPizzaPastriesById() {
        return orderPizzaPastriesById;
    }

    public void setOrderPizzaPastriesById(List<OrderPizzaPastry> orderPizzaPastriesById) {
        this.orderPizzaPastriesById = orderPizzaPastriesById;
    }
}
