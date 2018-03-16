package by.bsuir.pizzeria.beans;

import javax.persistence.*;

@Entity
@Table(name = "yourselfpizza_sizepizza", schema = "pizzeria", catalog = "")
public class YourselfpizzaSizepizzaEntity {
    private int id;
    private int idYourselfPizza;
    private int idSizePizza;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "idYourselfPizza", nullable = false)
    public int getIdYourselfPizza() {
        return idYourselfPizza;
    }

    public void setIdYourselfPizza(int idYourselfPizza) {
        this.idYourselfPizza = idYourselfPizza;
    }

    @Basic
    @Column(name = "idSizePizza", nullable = false)
    public int getIdSizePizza() {
        return idSizePizza;
    }

    public void setIdSizePizza(int idSizePizza) {
        this.idSizePizza = idSizePizza;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        YourselfpizzaSizepizzaEntity that = (YourselfpizzaSizepizzaEntity) o;

        if (id != that.id) return false;
        if (idYourselfPizza != that.idYourselfPizza) return false;
        if (idSizePizza != that.idSizePizza) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + idYourselfPizza;
        result = 31 * result + idSizePizza;
        return result;
    }
}
