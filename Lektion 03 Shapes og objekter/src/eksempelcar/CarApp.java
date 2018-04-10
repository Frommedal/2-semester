package eksempelcar;

public class CarApp {

    public static void main(String[] args) {
        Car myCar = new Car("VW UP", "White");
        System.out.println(myCar.getBrand());
        myCar.setRegistrationNumber("AB 11 123");
        System.out.println(myCar.getRegistrationNumber());

        Car Alex = new Car("Nissan Micra", "Guld");
        System.out.println(Alex.getBrand());
        Alex.setRegistrationNumber("KA 12 444");
        System.out.println(Alex.getRegistrationNumber());
        Alex.setKm(239);
        System.out.println("Bilen har kørt " + Alex.getKm() + " KM");

    }

}
