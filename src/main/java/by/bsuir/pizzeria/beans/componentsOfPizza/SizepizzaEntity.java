package by.bsuir.pizzeria.beans.componentsOfPizza;

import javax.persistence.*;

@Entity
@Table(name = "sizepizza", schema = "pizzeria", catalog = "")
public class SizepizzaEntity {
    private int id;
    private String size;
    private double coefficient;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "size", nullable = false, length = 50)
    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Basic
    @Column(name = "coefficient", nullable = false, precision = 0)
    public double getCoefficient() {
        return coefficient;
    }

    public void setCoefficient(double coefficient) {
        this.coefficient = coefficient;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SizepizzaEntity that = (SizepizzaEntity) o;

        if (id != that.id) return false;
        if (Double.compare(that.coefficient, coefficient) != 0) return false;
        if (size != null ? !size.equals(that.size) : that.size != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = id;
        result = 31 * result + (size != null ? size.hashCode() : 0);
        temp = Double.doubleToLongBits(coefficient);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
