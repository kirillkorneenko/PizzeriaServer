package by.bsuir.pizzeria.beans.order;

import javax.persistence.*;
import java.sql.Time;

@Entity
@Table(name = "order", schema = "pizzeria", catalog = "")
public class OrderEntity {
    private int id;
    private int idClient;
    private String address;
    private Time orderTime;
    private Time cookingTime;
    private String comment;
    private double totalPrice;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "idClient", nullable = false)
    public int getIdClient() {
        return idClient;
    }

    public void setIdClient(int idClient) {
        this.idClient = idClient;
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
    @Column(name = "orderTime", nullable = false)
    public Time getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(Time orderTime) {
        this.orderTime = orderTime;
    }

    @Basic
    @Column(name = "cookingTime", nullable = true)
    public Time getCookingTime() {
        return cookingTime;
    }

    public void setCookingTime(Time cookingTime) {
        this.cookingTime = cookingTime;
    }

    @Basic
    @Column(name = "comment", nullable = false, length = -1)
    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Basic
    @Column(name = "totalPrice", nullable = false, precision = 0)
    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OrderEntity that = (OrderEntity) o;

        if (id != that.id) return false;
        if (idClient != that.idClient) return false;
        if (Double.compare(that.totalPrice, totalPrice) != 0) return false;
        if (address != null ? !address.equals(that.address) : that.address != null) return false;
        if (orderTime != null ? !orderTime.equals(that.orderTime) : that.orderTime != null) return false;
        if (cookingTime != null ? !cookingTime.equals(that.cookingTime) : that.cookingTime != null) return false;
        if (comment != null ? !comment.equals(that.comment) : that.comment != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = id;
        result = 31 * result + idClient;
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (orderTime != null ? orderTime.hashCode() : 0);
        result = 31 * result + (cookingTime != null ? cookingTime.hashCode() : 0);
        result = 31 * result + (comment != null ? comment.hashCode() : 0);
        temp = Double.doubleToLongBits(totalPrice);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
