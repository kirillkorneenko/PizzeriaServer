package by.bsuir.pizzeria.beans.additionalProducts;

import javax.persistence.*;
import java.util.List;

@Entity
public class Drinkables {
    private Long id;
    private String name;
    private List<DrinkablesSizedrinkables> drinkablesSizedrinkablesById;
    private List<OrderDrinkables> orderDrinkablesById;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Drinkables that = (Drinkables) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
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
