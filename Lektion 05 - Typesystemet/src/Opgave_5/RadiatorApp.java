package Opgave_5;

public class RadiatorApp {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Radiator Radiator1 = new Radiator(50);
        Radiator Radiator2 = new Radiator(22);
        Radiator Radiator3 = new Radiator();
        System.out.println("Radiator1\t" + Radiator1.getTemp() + "\tgrader");
        Radiator1.skruop();
        System.out.println("Radiator1\t" + Radiator1.getTemp() + "\tgrader");
        Radiator1.skruned();
        System.out.println("Radiator1\t" + Radiator1.getTemp() + "\tgrader");
        System.out.println("Radiator1\t" + Radiator1.getTemp() + "\tgrader");
        Radiator1.setTemp(20);
        System.out.println("Radiator1\t" + Radiator1.getTemp() + "\tgrader");
        System.out.println("Radiator2\t" + Radiator2.getTemp() + "\tgrader");
        Radiator2.setTemp(28);
        System.out.println("Radiator2\t" + Radiator2.getTemp() + "\tgrader");
        System.out.println("Radiator2\t" + Radiator3.getTemp() + "\tgrader");
        Radiator3.setTemp(280);
        System.out.println("Radiator3\t" + Radiator3.getTemp() + "\tgrader");
    }

}
