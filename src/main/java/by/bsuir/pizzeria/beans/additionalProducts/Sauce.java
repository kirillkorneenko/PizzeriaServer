package by.bsuir.pizzeria.beans.additionalProducts;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

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
    @Column(name = "urlImg", nullable = false, length = 255)
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
        return Objects.equals(id, sauce.id) &&
                Objects.equals(name, sauce.name) &&
                Objects.equals(description, sauce.description) &&
                Objects.equals(urlImg, sauce.urlImg) &&
                Objects.equals(price, sauce.price);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, name, description, urlImg, price);
    }

    @OneToMany(mappedBy = "sauceByIdSauce")
    @JsonIgnore
    public List<OrderSauce> getOrderSaucesById() {
        return orderSaucesById;
    }

    public void setOrderSaucesById(List<OrderSauce> orderSaucesById) {
        this.orderSaucesById = orderSaucesById;
    }
}
