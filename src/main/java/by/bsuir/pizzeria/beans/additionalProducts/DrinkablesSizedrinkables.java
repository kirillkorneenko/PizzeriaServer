package by.bsuir.pizzeria.beans.additionalProducts;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

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
    @GeneratedValue
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

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (idDrinkables != null ? !idDrinkables.equals(that.idDrinkables) : that.idDrinkables != null) return false;
        if (idSizeDrinkables != null ? !idSizeDrinkables.equals(that.idSizeDrinkables) : that.idSizeDrinkables != null)
            return false;
        if (price != null ? !price.equals(that.price) : that.price != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (idDrinkables != null ? idDrinkables.hashCode() : 0);
        result = 31 * result + (idSizeDrinkables != null ? idSizeDrinkables.hashCode() : 0);
        result = 31 * result + (price != null ? price.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "idDrinkables", referencedColumnName = "id", nullable = false, insertable = false, updatable = false)
    @JsonIgnore
    public Drinkables getDrinkablesByIdDrinkables() {
        return drinkablesByIdDrinkables;
    }

    public void setDrinkablesByIdDrinkables(Drinkables drinkablesByIdDrinkables) {
        this.drinkablesByIdDrinkables = drinkablesByIdDrinkables;
    }

    @ManyToOne
    @JoinColumn(name = "idSizeDrinkables", referencedColumnName = "id", nullable = false, insertable = false, updatable = false)
    @JsonIgnore
    public Sizedrinkables getSizedrinkablesByIdSizeDrinkables() {
        return sizedrinkablesByIdSizeDrinkables;
    }

    public void setSizedrinkablesByIdSizeDrinkables(Sizedrinkables sizedrinkablesByIdSizeDrinkables) {
        this.sizedrinkablesByIdSizeDrinkables = sizedrinkablesByIdSizeDrinkables;
    }
}
