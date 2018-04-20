package by.bsuir.pizzeria.beans.pizza;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
public class Sales {
    private Long id;
    private Integer percent;
    private String description;
    private List<Pizza> pizzasForSales;

    @Id
    @Column(name = "id", nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "percent", nullable = false)
    public Integer getPercent() {
        return percent;
    }

    public void setPercent(Integer percent) {
        this.percent = percent;
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
        Sales sales = (Sales) o;
        return Objects.equals(id, sales.id) &&
                Objects.equals(percent, sales.percent) &&
                Objects.equals(description, sales.description);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, percent, description);
    }

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "sales_pizza",
            joinColumns = @JoinColumn(name = "idSales"),
            inverseJoinColumns = @JoinColumn(name = "idPizza"))
    public List<Pizza> getPizzasForSales() {
        return pizzasForSales;
    }

    public void setPizzasForSales(List<Pizza> pizzasForSales) {
        this.pizzasForSales = pizzasForSales;
    }
}
