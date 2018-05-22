package opgave_3;

import java.time.LocalDate;

public class OrderApp {
    public static void main(String[] args) {
        Product product1 = new Product(201, "Gule handsker i valgfri farve", 300.0);
        Product product2 = new Product(202, "Israeler trompet", 2200.0);
        Product product3 = new Product(203, "Badalaika mel", 400.0);
        Product product4 = new Product(204, "Jubel krudt", 400.0);
        Product product5 = new Product(205, "Mongol benzin", 50.0);

        Customer customer1 = new Customer("Henrik", LocalDate.parse("1996-01-01"));
        Customer customer2 = new Customer("Martin", LocalDate.parse("1984-01-01"));

        Order order1 = new Order(1);
        Order order2 = new Order(2);

        order1.createOrderLine(1, product1);
        order1.createOrderLine(1, product2);
        order1.createOrderLine(1, product3);
        order1.createOrderLine(1, product4);
        order1.createOrderLine(1, product5);

        customer1.addOrder(order1);
        // customer1.addOrder(order2);
        customer2.addOrder(order1);
        // customer2.addOrder(order2);
        // customer2.addOrder(order3);
        // customer2.addOrder(order4);
        System.out.println(order1.getOrderPrice());

        Discount percentDiscount = new PercentDiscount(order1.getOrderPrice());
        Discount fixedDiscount = new FixedDiscount(order1.getOrderPrice());
        customer1.setDiscount(fixedDiscount);
        customer2.setDiscount(percentDiscount);
        System.out.println(customer1.getDiscountedPrice(order1));
        System.out.println(customer2.getDiscountedPrice(order1));

    }
}
