package model;

import model.Item;

public class OrderLine implements Value {
    private int quantity;
    private Item item;

    public OrderLine(int quantity, Item item) {
        this.quantity = quantity;
        this.item = item;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int number) {
        this.quantity = number;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    // Opgave S2.
    @Override
    public double value() {
        return item.getPrice() * getQuantity();
    }

}
