package model;

import java.util.ArrayList;

import model.Order;

public class Guest implements Value {
    private String name;
    private int roomNumber;

    ArrayList<Order> orders = new ArrayList<>();

    public Guest(String name, int roomNumber) {
        this.name = name;
        this.roomNumber = roomNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public ArrayList<Order> getOrders() {
        return new ArrayList<>(orders);
    }

    public void addOrderLines(Order order) {
        this.orders.add(order);
    }

    @SuppressWarnings("unused")
	private void removeOrderLines(Order order) {
        this.orders.remove(order);
    }

    // Opgave S4.
    @Override
    public double value() {
        double totalValueOfOrders = 0;

        for (Order order : orders) {
            totalValueOfOrders = +order.value();
        }
        return totalValueOfOrders;
    }

    // Opgave S5.
    public boolean haveOrdered(Item item) {
        boolean isOrdered = false;
        for (Order order : orders) {
            for (OrderLine orderLine : order.getOrderlines()) {
                if (item.equals(orderLine.getItem())) {
                    isOrdered = true;
                }
            }
        }
        return isOrdered;
    }

    // Opgave S8.
    public ArrayList<String> notPaidOrders() {
        ArrayList<String> notPaidOrders = new ArrayList<>();

        for (Order order : orders) {
            if (!order.isPaid()) {
                for (OrderLine orderline : order.getOrderlines()) {
                    notPaidOrders.add("Dato: " + order.getDate().toString() + ", " + orderline.getQuantity() + " stk. "
                            + orderline.getItem().getName() + ", Pris: " + orderline.getItem().getPrice() + " kr.");
                }
            }
        }
        return notPaidOrders;
    }

    public void addOrder(Order order) {
        if (!orders.contains(order)) {
            orders.add(order);
        }
    }

    @Override
    public String toString() {
        return (getName() + ", " + getRoomNumber());
    }
}
