package opgave_1;

public class RentalApp {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Car f500 = new Car("aj93418", 300, 2010);
        Car ffiesta = new Car("ff22132", 400, 2011);
        Car taunus = new Car("as45229", 200, 1977);
        Car multipla = new Car("mm22856", 50, 2005);
        Car wagonR = new Car("pj63895", 100, 2006);

        Rental r1 = new Rental(100, "20/03-2018", 5);
        Rental r2 = new Rental(101, "21/03-2018", 10);

        r1.addCar(f500);
        r1.addCar(taunus);

        r2.addCar(taunus);
        r2.addCar(wagonR);
        r2.addCar(ffiesta);
        r2.addCar(multipla);

        System.out.println(r1.getPrice());
        System.out.println(r2.getPrice());

        Rental r3 = new Rental(102, "22/03-2018", 7);
        r3.createCar("ncube", 12, 2010);

        System.out.println("Den totale pris for udlejningen er: " + r3.getPrice() + " DKK");

        System.out.println(taunus.longestRental());
    }

}
