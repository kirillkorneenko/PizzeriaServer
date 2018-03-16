package by.bsuir.pizzeria.beans;

import javax.persistence.*;

@Entity
@Table(name = "drinkables_sizedrinkables", schema = "pizzeria", catalog = "")
public class DrinkablesSizedrinkablesEntity {
    private int id;
    private int idDrinkables;
    private int idSizeDrinkables;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "idDrinkables", nullable = false)
    public int getIdDrinkables() {
        return idDrinkables;
    }

    public void setIdDrinkables(int idDrinkables) {
        this.idDrinkables = idDrinkables;
    }

    @Basic
    @Column(name = "idSizeDrinkables", nullable = false)
    public int getIdSizeDrinkables() {
        return idSizeDrinkables;
    }

    public void setIdSizeDrinkables(int idSizeDrinkables) {
        this.idSizeDrinkables = idSizeDrinkables;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DrinkablesSizedrinkablesEntity that = (DrinkablesSizedrinkablesEntity) o;

        if (id != that.id) return false;
        if (idDrinkables != that.idDrinkables) return false;
        if (idSizeDrinkables != that.idSizeDrinkables) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + idDrinkables;
        result = 31 * result + idSizeDrinkables;
        return result;
    }
}
