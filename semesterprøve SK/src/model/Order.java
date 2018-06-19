package model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Order implements Value {
    private LocalDate date;
    private boolean paid;
    private Item item;
    private Guest guest;

    ArrayList<OrderLine> orderlines = new ArrayList<>();

    public Order(Guest guest, LocalDate date) {
        this.date = date;
        this.paid = false;
        this.setGuest(guest);
        guest.addOrder(this);
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public boolean isPaid() {
        return paid;
    }

    public void setPaid(boolean paid) {
        this.paid = paid;
    }

    public ArrayList<OrderLine> getOrderlines() {
        return new ArrayList<>(orderlines);
    }

    public void addOrderLines(OrderLine orderline) {
        this.orderlines.add(orderline);
    }

    public OrderLine createOrderLine(int quantity, Item item) {
        OrderLine ol = new OrderLine(quantity, item);
        orderlines.add(ol);
        return ol;
    }

    // Opgave S3.
    @Override
    public double value() {
        double totalValue = 0;

        for (OrderLine orderLine : orderlines) {
            totalValue = +orderLine.value();
        }
        return totalValue;
    }

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public Guest getGuest() {
		return guest;
	}

	public void setGuest(Guest guest) {
		this.guest = guest;
	}

}
