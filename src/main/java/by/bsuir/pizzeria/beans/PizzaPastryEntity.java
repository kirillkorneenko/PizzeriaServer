package by.bsuir.pizzeria.beans;

import javax.persistence.*;

@Entity
@Table(name = "pizza_pastry", schema = "pizzeria", catalog = "")
public class PizzaPastryEntity {
    private int id;
    private int idPizza;
    private int idPastry;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "idPizza", nullable = false)
    public int getIdPizza() {
        return idPizza;
    }

    public void setIdPizza(int idPizza) {
        this.idPizza = idPizza;
    }

    @Basic
    @Column(name = "idPastry", nullable = false)
    public int getIdPastry() {
        return idPastry;
    }

    public void setIdPastry(int idPastry) {
        this.idPastry = idPastry;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PizzaPastryEntity that = (PizzaPastryEntity) o;

        if (id != that.id) return false;
        if (idPizza != that.idPizza) return false;
        if (idPastry != that.idPastry) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + idPizza;
        result = 31 * result + idPastry;
        return result;
    }
}
