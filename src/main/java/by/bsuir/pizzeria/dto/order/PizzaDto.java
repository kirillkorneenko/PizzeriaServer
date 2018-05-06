package by.bsuir.pizzeria.dto.order;

import by.bsuir.pizzeria.beans.pizza.Pastry;
import by.bsuir.pizzeria.beans.pizza.Sizepizza;

import java.util.List;

public class PizzaDto {

    private Long id;
    private String name;
    private Sizepizza size;
    private Pastry pastry;
    private Double price;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Sizepizza getSize() {
        return size;
    }

    public void setSize(Sizepizza size) {
        this.size = size;
    }

    public Pastry getPastry() {
        return pastry;
    }

    public void setPastry(Pastry pastry) {
        this.pastry = pastry;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
