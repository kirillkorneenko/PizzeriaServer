package by.bsuir.pizzeria.beans.additionalProducts;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
public class Sauce {
    private Long id;
    private String name;
    private Double price;
    private List<OrderSauce> orderSaucesById;

    @Id
    @Column(name = "id", nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name", nullable = false, length = 50)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "price", nullable = false, precision = 0)
    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sauce sauce = (Sauce) o;
        return Objects.equals(id, sauce.id) &&
                Objects.equals(name, sauce.name) &&
                Objects.equals(price, sauce.price);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, name, price);
    }

    @OneToMany(mappedBy = "sauceByIdSauce")
    public List<OrderSauce> getOrderSaucesById() {
        return orderSaucesById;
    }

    public void setOrderSaucesById(List<OrderSauce> orderSaucesById) {
        this.orderSaucesById = orderSaucesById;
    }
}
