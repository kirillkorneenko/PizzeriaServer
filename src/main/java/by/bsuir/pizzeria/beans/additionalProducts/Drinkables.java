package by.bsuir.pizzeria.beans.additionalProducts;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
public class Drinkables {
    private Long id;
    private String name;
    private String description;
    private Double price;
    private String urlImg;
    private List<DrinkablesSizedrinkables> drinkablesSizedrinkablesById;
    private List<OrderDrinkables> orderDrinkablesById;

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
    @Column(name = "description", nullable = false, length = -1)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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
        Drinkables that = (Drinkables) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(name, that.name) &&
                Objects.equals(description, that.description) &&
                Objects.equals(price, that.price) &&
                Objects.equals(urlImg, that.urlImg) &&
                Objects.equals(drinkablesSizedrinkablesById, that.drinkablesSizedrinkablesById) &&
                Objects.equals(orderDrinkablesById, that.orderDrinkablesById);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, name, description, price, urlImg, drinkablesSizedrinkablesById, orderDrinkablesById);
    }

    @OneToMany(mappedBy = "drinkablesByIdDrinkables")
    public List<DrinkablesSizedrinkables> getDrinkablesSizedrinkablesById() {
        return drinkablesSizedrinkablesById;
    }

    public void setDrinkablesSizedrinkablesById(List<DrinkablesSizedrinkables> drinkablesSizedrinkablesById) {
        this.drinkablesSizedrinkablesById = drinkablesSizedrinkablesById;
    }

    @OneToMany(mappedBy = "drinkablesByIdDrinkables")
    public List<OrderDrinkables> getOrderDrinkablesById() {
        return orderDrinkablesById;
    }

    public void setOrderDrinkablesById(List<OrderDrinkables> orderDrinkablesById) {
        this.orderDrinkablesById = orderDrinkablesById;
    }
}
