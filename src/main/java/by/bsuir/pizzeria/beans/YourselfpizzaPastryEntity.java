package by.bsuir.pizzeria.beans;

import javax.persistence.*;

@Entity
@Table(name = "yourselfpizza_pastry", schema = "pizzeria", catalog = "")
public class YourselfpizzaPastryEntity {
    private int id;
    private int idYourselfPizza;
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
    @Column(name = "idYourselfPizza", nullable = false)
    public int getIdYourselfPizza() {
        return idYourselfPizza;
    }

    public void setIdYourselfPizza(int idYourselfPizza) {
        this.idYourselfPizza = idYourselfPizza;
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

        YourselfpizzaPastryEntity that = (YourselfpizzaPastryEntity) o;

        if (id != that.id) return false;
        if (idYourselfPizza != that.idYourselfPizza) return false;
        if (idPastry != that.idPastry) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + idYourselfPizza;
        result = 31 * result + idPastry;
        return result;
    }
}
