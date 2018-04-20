package by.bsuir.pizzeria.beans.additionalProducts;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "drinkables_sizedrinkables", schema = "pizzeria", catalog = "")
public class DrinkablesSizedrinkables {
    private Long id;
    private Long idDrinkables;
    private Long idSizeDrinkables;
    private Double price;
    private Drinkables drinkablesByIdDrinkables;
    private Sizedrinkables sizedrinkablesByIdSizeDrinkables;

    @Id
    @Column(name = "id", nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "idDrinkables", nullable = false)
    public Long getIdDrinkables() {
        return idDrinkables;
    }

    public void setIdDrinkables(Long idDrinkables) {
        this.idDrinkables = idDrinkables;
    }

    @Basic
    @Column(name = "idSizeDrinkables", nullable = false)
    public Long getIdSizeDrinkables() {
        return idSizeDrinkables;
    }

    public void setIdSizeDrinkables(Long idSizeDrinkables) {
        this.idSizeDrinkables = idSizeDrinkables;
    }

    @Basic
    @Column(name = "price", nullable = false, precision = 0)
    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DrinkablesSizedrinkables that = (DrinkablesSizedrinkables) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(idDrinkables, that.idDrinkables) &&
                Objects.equals(idSizeDrinkables, that.idSizeDrinkables) &&
                Objects.equals(price, that.price);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, idDrinkables, idSizeDrinkables, price);
    }

    @ManyToOne
    @JoinColumn(name = "idDrinkables", referencedColumnName = "id", nullable = false)
    public Drinkables getDrinkablesByIdDrinkables() {
        return drinkablesByIdDrinkables;
    }

    public void setDrinkablesByIdDrinkables(Drinkables drinkablesByIdDrinkables) {
        this.drinkablesByIdDrinkables = drinkablesByIdDrinkables;
    }

    @ManyToOne
    @JoinColumn(name = "idSizeDrinkables", referencedColumnName = "id", nullable = false)
    public Sizedrinkables getSizedrinkablesByIdSizeDrinkables() {
        return sizedrinkablesByIdSizeDrinkables;
    }

    public void setSizedrinkablesByIdSizeDrinkables(Sizedrinkables sizedrinkablesByIdSizeDrinkables) {
        this.sizedrinkablesByIdSizeDrinkables = sizedrinkablesByIdSizeDrinkables;
    }
}
