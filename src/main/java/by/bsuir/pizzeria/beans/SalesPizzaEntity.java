package by.bsuir.pizzeria.beans;

import javax.persistence.*;

@Entity
@Table(name = "sales_pizza", schema = "pizzeria", catalog = "")
public class SalesPizzaEntity {
    private int id;
    private Integer idPizza;
    private Integer idSales;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "idPizza", nullable = true)
    public Integer getIdPizza() {
        return idPizza;
    }

    public void setIdPizza(Integer idPizza) {
        this.idPizza = idPizza;
    }

    @Basic
    @Column(name = "idSales", nullable = true)
    public Integer getIdSales() {
        return idSales;
    }

    public void setIdSales(Integer idSales) {
        this.idSales = idSales;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SalesPizzaEntity that = (SalesPizzaEntity) o;

        if (id != that.id) return false;
        if (idPizza != null ? !idPizza.equals(that.idPizza) : that.idPizza != null) return false;
        if (idSales != null ? !idSales.equals(that.idSales) : that.idSales != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (idPizza != null ? idPizza.hashCode() : 0);
        result = 31 * result + (idSales != null ? idSales.hashCode() : 0);
        return result;
    }
}
