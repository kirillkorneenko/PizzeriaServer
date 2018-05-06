package by.bsuir.pizzeria.beans.pizza;

import by.bsuir.pizzeria.beans.order.Orders;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
public class Pizzeria {
    private Long id;
    private String address;
    private String name;
    private String metroStation;
    private String imgUrl;
    private String phone;

    private List<Orders> ordersById;

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
    @Column(name = "address", nullable = false, length = 50)
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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
    @Column(name = "metroStation", nullable = false, length = 50)
    public String getMetroStation() {
        return metroStation;
    }

    public void setMetroStation(String metroStation) {
        this.metroStation = metroStation;
    }

    @Basic
    @Column(name = "imgUrl", nullable = false, length = 100)
    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    @Basic
    @Column(name = "phone", nullable = false, length = 50)
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pizzeria pizzeria = (Pizzeria) o;
        return Objects.equals(id, pizzeria.id) &&
                Objects.equals(address, pizzeria.address) &&
                Objects.equals(name, pizzeria.name) &&
                Objects.equals(metroStation, pizzeria.metroStation) &&
                Objects.equals(imgUrl, pizzeria.imgUrl) &&
                Objects.equals(phone, pizzeria.phone);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, address, name, metroStation, imgUrl, phone);
    }

    @OneToMany(mappedBy = "pizzeriaByIdPizzeria")
    @JsonIgnore
    public List<Orders> getOrdersById() {
        return ordersById;
    }

    public void setOrdersById(List<Orders> ordersById) {
        this.ordersById = ordersById;
    }
}
