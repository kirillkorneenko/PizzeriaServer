package by.bsuir.pizzeria.beans.additionalProducts;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
public class Sizedrinkables {
    private Long id;
    private Integer size;
    private List<DrinkablesSizedrinkables> drinkablesSizedrinkablesById;

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

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (size != null ? !size.equals(that.size) : that.size != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (size != null ? size.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "sizedrinkablesByIdSizeDrinkables")
    @JsonIgnore
    public List<DrinkablesSizedrinkables> getDrinkablesSizedrinkablesById() {
        return drinkablesSizedrinkablesById;
    }

    public void setDrinkablesSizedrinkablesById(List<DrinkablesSizedrinkables> drinkablesSizedrinkablesById) {
        this.drinkablesSizedrinkablesById = drinkablesSizedrinkablesById;
    }
}
