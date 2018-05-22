package opgave_3;

import java.time.LocalDate;

public class testApp {

    public static void main(String[] args) {
        Product p201 = new Product(201, "Gule handsker i valgfri farve", 300.0);
        Product p202 = new Product(202, "Israeler trompet", 2200.0);
        Product p203 = new Product(203, "Badalaika mel", 400.0);
        Product p204 = new Product(204, "Jubel krudt", 400.0);
        Product p205 = new Product(205, "Mongol benzin", 50.0);

        Customer c1 = new Customer("Benjamin Larsen", LocalDate.parse("1995-04-17"));
        Customer c2 = new Customer("Torben Grove", LocalDate.parse("1990-04-03"));
    }

}
