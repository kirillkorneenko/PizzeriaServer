package by.bsuir.pizzeria.beans;

import javax.persistence.*;

@Entity
@Table(name = "sizedrinkables", schema = "pizzeria", catalog = "")
public class SizedrinkablesEntity {
    private int id;
    private int size;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "size", nullable = false)
    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SizedrinkablesEntity that = (SizedrinkablesEntity) o;

        if (id != that.id) return false;
        if (size != that.size) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + size;
        return result;
    }
}
