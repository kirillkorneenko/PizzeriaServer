package by.bsuir.pizzeria.dto.order;

import by.bsuir.pizzeria.beans.additionalProducts.Drinkables;
import by.bsuir.pizzeria.beans.additionalProducts.Sauce;
import by.bsuir.pizzeria.beans.pizza.Pizza;
import by.bsuir.pizzeria.beans.pizza.Pizzeria;

import java.util.List;

public class OrderDto {
    private String phone;
    private String name;
    private String surname;
    private Pizzeria address;
    private String comment;
    private String totalCost;
    private List<PizzaDto> pizzaList;
    private List<Sauce> sauceList;
    private List<Drinkables> drinksList;

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Pizzeria getAddress() {
        return address;
    }

    public void setAddress(Pizzeria address) {
        this.address = address;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(String totalCost) {
        this.totalCost = totalCost;
    }

    public List<PizzaDto> getPizzaList() {
        return pizzaList;
    }

    public void setPizzaList(List<PizzaDto> pizzaList) {
        this.pizzaList = pizzaList;
    }

    public List<Sauce> getSauceList() {
        return sauceList;
    }

    public void setSauceList(List<Sauce> sauceList) {
        this.sauceList = sauceList;
    }

    public List<Drinkables> getDrinksList() {
        return drinksList;
    }

    public void setDrinksList(List<Drinkables> drinksList) {
        this.drinksList = drinksList;
    }
}
