package by.bsuir.pizzeria.beans.order;

import javax.persistence.*;

@Entity
@Table(name = "order_yourselfpizza_sizepizza", schema = "pizzeria", catalog = "")
public class OrderYourselfpizzaSizepizzaEntity {
    private int id;
    private int idOrderYourselfPizza;
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
    @Column(name = "idOrderYourselfPizza", nullable = false)
    public int getIdOrderYourselfPizza() {
        return idOrderYourselfPizza;
    }

    public void setIdOrderYourselfPizza(int idOrderYourselfPizza) {
        this.idOrderYourselfPizza = idOrderYourselfPizza;
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

        OrderYourselfpizzaSizepizzaEntity that = (OrderYourselfpizzaSizepizzaEntity) o;

        if (id != that.id) return false;
        if (idOrderYourselfPizza != that.idOrderYourselfPizza) return false;
        if (idSizePizza != that.idSizePizza) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + idOrderYourselfPizza;
        result = 31 * result + idSizePizza;
        return result;
    }
}
