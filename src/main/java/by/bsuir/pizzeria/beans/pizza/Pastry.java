package by.bsuir.pizzeria.beans.pizza;

import javax.persistence.*;
import java.util.List;

@Entity
public class Pastry {
    private Long id;
    private String kind;

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
    @Column(name = "kind", nullable = false, length = 50)
    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Pastry pastry = (Pastry) o;

        if (id != null ? !id.equals(pastry.id) : pastry.id != null) return false;
        if (kind != null ? !kind.equals(pastry.kind) : pastry.kind != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (kind != null ? kind.hashCode() : 0);
        return result;
    }



}
