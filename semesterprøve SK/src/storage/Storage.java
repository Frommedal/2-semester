package storage;

import java.util.ArrayList;

import model.Guest;
import model.Item;

// Opgave S6.
public class Storage {

    private static ArrayList<Guest> guests = new ArrayList<>();
    private static ArrayList<Item> items = new ArrayList<>();

    // -------------------------------------------------------------------------

    public static ArrayList<Guest> getGuests() {
        return new ArrayList<>(guests);
    }

    public static void addGuest(Guest guest) {
        guests.add(guest);
    }

    // -------------------------------------------------------------------------

    public static ArrayList<Item> getItems() {
        return new ArrayList<>(items);
    }

    public static void addItems(Item item) {
        items.add(item);
    }
}
