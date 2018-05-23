package model;

import java.util.ArrayList;
import model.OrderLine;

public class Item {
    private String name;
    private String manufacturer;
    private double quantity;
    private double price;

    ArrayList<OrderLine> orderlines = new ArrayList<>();

    public Item(String name, String manufacturer, double quantity, double price) {
        this.name = name;
        this.manufacturer = manufacturer;
        this.quantity = quantity;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public ArrayList<OrderLine> getOrderlines() {
        return new ArrayList<>(orderlines);
    }

    public void addOrderLines(OrderLine orderline) {
        this.orderlines.add(orderline);
    }

    private void removeOrderLines(OrderLine orderline) {
        this.orderlines.remove(orderline);
    }

}
