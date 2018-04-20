package by.bsuir.pizzeria.beans.additionalProducts;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
public class Drinkables {
    private Long id;
    private String name;

    private List<DrinkablesSizedrinkables> drinkablesSizedrinkablesById;
    private List<OrderDrinkables> orderDrinkablesById;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Drinkables that = (Drinkables) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, name);
    }

    @OneToMany(mappedBy = "drinkablesByIdDrinkables")
    public List<DrinkablesSizedrinkables> getDrinkablesSizedrinkablesById() {
        return drinkablesSizedrinkablesById;
    }

    public void setDrinkablesSizedrinkablesById(List<DrinkablesSizedrinkables> drinkablesSizedrinkablesById) {
        this.drinkablesSizedrinkablesById = drinkablesSizedrinkablesById;
    }

    @OneToMany(mappedBy = "drinkablesByIdDrinkables")
    public List<OrderDrinkables> getOrderDrinkablesById() {
        return orderDrinkablesById;
    }

    public void setOrderDrinkablesById(List<OrderDrinkables> orderDrinkablesById) {
        this.orderDrinkablesById = orderDrinkablesById;
    }
}
