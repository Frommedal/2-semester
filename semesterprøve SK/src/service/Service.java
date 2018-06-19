package service;

import java.time.LocalDate;
import java.util.ArrayList;
import model.Guest;
import model.Order;
import storage.Storage;
import model.Item;

public class Service {

    public static void createSomeObjects() {
        Item i1 = createItem("Cola", "Coca Cola", 0.5, 28.0);
        Item i2 = createItem("Cola", "Pepsi", 0.5, 26.0);
        Item i3 = createItem("Øl", "Tuborg", 0.33, 33.0);
        Item i4 = createItem("Øl", "Carlsberg", 0.57, 48.0);

        Guest g1 = createGuest("Ib", 17);
        //Guest g2 = createGuest("Eva", 12);
        //Guest g3 = createGuest("Lene", 8);

        Order o1 = createOrder(g1, LocalDate.of(2014, 06, 15));
        Order o2 = createOrder(g1, LocalDate.of(2014, 06, 16));

        o1.createOrderLine(3, i3);
        o1.createOrderLine(2, i1);
        o1.createOrderLine(2, i2);

        o2.createOrderLine(2, i3);
        o2.createOrderLine(3, i2);
        o2.createOrderLine(4, i4);
    }

    // -------------------------------------------------------------------------

    public static Guest createGuest(String name, int roomNumber) {
        Guest guest = new Guest(name, roomNumber);
        Storage.addGuest(guest);
        return guest;
    }

    public static void updateGuest(Guest guest, String name, int roomNumber) {
        guest.setName(name);
        guest.setRoomNumber(roomNumber);
        System.out.println(name);
    }

    public static ArrayList<Guest> getGuests() {
        return new ArrayList<>(Storage.getGuests());
    }

    // -------------------------------------------------------------------------

    public static Item createItem(String name, String manufacture, double quantity, double price) {
        Item item = new Item(name, manufacture, quantity, price);
        Storage.addItems(item);
        return item;
    }

    public static void updateItem(Item item, String name, String manufacturer, double quantity, double price) {
        item.setName(name);
        item.setManufacturer(manufacturer);
        item.setQuantity(quantity);
        item.setPrice(price);
    }

    public static ArrayList<Item> getItems() {
        return Storage.getItems();
    }

    // -------------------------------------------------------------------------

    public static Order createOrder(Guest guest, LocalDate date) {
        Order order = new Order(guest, date);
        return order;
    }
}
