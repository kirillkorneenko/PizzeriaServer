package by.bsuir.pizzeria.beans.additionalProducts;

import javax.persistence.*;
import java.util.List;

@Entity
public class Sauce {
    private Long id;
    private String name;
    private String description;
    private String urlImg;
    private Double price;
    private List<OrderSauce> orderSaucesById;

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


    @Basic
    @Column(name = "description", nullable = false, length = -1)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "urlImg", nullable = false, length = 50)
    public String getUrlImg() {
        return urlImg;
    }

    public void setUrlImg(String urlImg) {
        this.urlImg = urlImg;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Sauce sauce = (Sauce) o;

        if (id != null ? !id.equals(sauce.id) : sauce.id != null) return false;
        if (name != null ? !name.equals(sauce.name) : sauce.name != null) return false;
        if (price != null ? !price.equals(sauce.price) : sauce.price != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (price != null ? price.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "sauceByIdSauce")
    public List<OrderSauce> getOrderSaucesById() {
        return orderSaucesById;
    }

    public void setOrderSaucesById(List<OrderSauce> orderSaucesById) {
        this.orderSaucesById = orderSaucesById;
    }
}
