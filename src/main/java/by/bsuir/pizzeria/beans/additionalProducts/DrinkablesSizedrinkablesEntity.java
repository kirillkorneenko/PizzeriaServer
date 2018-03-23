package by.bsuir.pizzeria.beans.additionalProducts;

import javax.persistence.*;

@Entity
@Table(name = "drinkables_sizedrinkables", schema = "pizzeria", catalog = "")
public class DrinkablesSizedrinkablesEntity {
    private int id;
    private int idDrinkables;
    private int idSizeDrinkables;
    private double price;

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

    @Basic
    @Column(name = "price", nullable = false, precision = 0)
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DrinkablesSizedrinkablesEntity that = (DrinkablesSizedrinkablesEntity) o;

        if (id != that.id) return false;
        if (idDrinkables != that.idDrinkables) return false;
        if (idSizeDrinkables != that.idSizeDrinkables) return false;
        if (Double.compare(that.price, price) != 0) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = id;
        result = 31 * result + idDrinkables;
        result = 31 * result + idSizeDrinkables;
        temp = Double.doubleToLongBits(price);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
