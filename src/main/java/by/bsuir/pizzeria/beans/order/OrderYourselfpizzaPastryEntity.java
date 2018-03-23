package by.bsuir.pizzeria.beans.order;

import javax.persistence.*;

@Entity
@Table(name = "order_yourselfpizza_pastry", schema = "pizzeria", catalog = "")
public class OrderYourselfpizzaPastryEntity {
    private int id;
    private int idOrderYourselfPizza;
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
    @Column(name = "idOrderYourselfPizza", nullable = false)
    public int getIdOrderYourselfPizza() {
        return idOrderYourselfPizza;
    }

    public void setIdOrderYourselfPizza(int idOrderYourselfPizza) {
        this.idOrderYourselfPizza = idOrderYourselfPizza;
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

        OrderYourselfpizzaPastryEntity that = (OrderYourselfpizzaPastryEntity) o;

        if (id != that.id) return false;
        if (idOrderYourselfPizza != that.idOrderYourselfPizza) return false;
        if (idPastry != that.idPastry) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + idOrderYourselfPizza;
        result = 31 * result + idPastry;
        return result;
    }
}
