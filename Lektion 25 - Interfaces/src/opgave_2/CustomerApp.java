package opgave_2;

public class CustomerApp {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Customer c1 = new Customer("Benjamin", "Rarsen", 21);
        Customer c2 = new Customer("Peter", "Dr.Hansen", 22);
        Customer c3 = new Customer("Torbe", "ProShop", 28);

        Customer[] customers = { c1, c2, c3 };
        Customer lastcustomer = Customer.lastCustomer(customers);

        System.out.println(
                lastcustomer.getFirstName() + " " + lastcustomer.getLastName() + ", " + lastcustomer.getAge() + " år.");

        Customer[] aftercustomer = Customer.afterCustomer(customers, c1);
        for (Customer customer : aftercustomer) {
            System.out.println(customer.getFirstName());
        }
    }

}
