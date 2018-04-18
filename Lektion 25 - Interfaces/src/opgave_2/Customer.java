package opgave_2;

import java.util.Arrays;

public class Customer implements Comparable<Customer> {
    private String firstName;
    private String lastName;
    private int age = 0;

    public Customer(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Customer T) {
        if (this.lastName.compareTo(T.lastName) == 0) {
            if (this.firstName.compareTo(T.firstName) == 0) {
                return this.age - T.age;

            } else if (this.firstName.compareTo(T.firstName) < 0) {
                return -1;
            } else {
                return 1;
            }
        } else if (this.lastName.compareTo(T.lastName) < 0) {
            return -1;
        } else {
            return 1;
        }

    }

    public static Customer lastCustomer(Customer[] customers) {
        Customer customer = customers[0];
        for (int i = 1; i < customers.length; i++) {
            if (customer.compareTo(customers[i]) < 0) {
                customer = customers[i];
            } else {
                // do nothing
            }
        }
        return customer;
    }

    public static Customer[] afterCustomer(Customer[] customers, Customer customer) {
        // Customer[] afterCustomers;
        // for (int i = 0; i < customers.length; i++) {
        // if (customer.compareTo(customers[i]) < 0) {
        // afterCustomers = new Customer[customers.length - i];
        // for (int j = 0; j < afterCustomers.length; j++) {
        // afterCustomers[j] = customers[i + 1];
        // i++;
        // }
        // return afterCustomers;
        // }
        // }
        // return null;

        // dur ikke.

        Customer[] sorted = customers.clone();
        Arrays.sort(sorted);

        int after = 0;
        for (int i = 0; i < sorted.length; i++) {
            if (sorted[i].equals(customer)) {
                after = i + 1;
            }

        }
        return Arrays.copyOfRange(sorted, after, sorted.length);
    }
}
