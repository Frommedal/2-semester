package opgave_1;

import java.util.ArrayList;

public class Rental {

    private int number;
    private int days;
    private String date;
    private ArrayList<Car> cars = new ArrayList<>();

    public Rental(int number, String date, int days) {
        this.setNumber(number);
        this.setDate(date);
        this.days = days;

    }

    public double getPrice() {
        double price = 0.0;

        for (Car car : cars) {
            price += car.getDayPrice();
        }
        price *= days;
        return price;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public int getDays() {
        return days;
    }

    public void addCar(Car car) {
        car.addRental(this);
        cars.add(car);
    }

    public void removeCar(Car car) {
        car.removeRental(this);
        cars.remove(car);
    }

    public Car createCar(String carname, double pricePerDay, int purchaseYear) {
        Car car = new Car(carname, pricePerDay, purchaseYear);
        cars.add(car);
        return car;
    }

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
}
