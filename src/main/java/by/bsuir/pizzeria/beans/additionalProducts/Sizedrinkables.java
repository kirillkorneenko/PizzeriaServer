package by.bsuir.pizzeria.beans.additionalProducts;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
public class Sizedrinkables {
    private Long id;
    private Integer size;
    private List<DrinkablesSizedrinkables> drinkablesSizedrinkablesById;

    @Id
    @Column(name = "id", nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "size", nullable = false)
    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sizedrinkables that = (Sizedrinkables) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(size, that.size);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, size);
    }

    @OneToMany(mappedBy = "sizedrinkablesByIdSizeDrinkables")
    public List<DrinkablesSizedrinkables> getDrinkablesSizedrinkablesById() {
        return drinkablesSizedrinkablesById;
    }

    public void setDrinkablesSizedrinkablesById(List<DrinkablesSizedrinkables> drinkablesSizedrinkablesById) {
        this.drinkablesSizedrinkablesById = drinkablesSizedrinkablesById;
    }
}
