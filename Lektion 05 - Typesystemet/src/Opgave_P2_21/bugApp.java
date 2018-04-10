package Opgave_P2_21;

public class bugApp {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Bug bug1 = new Bug(10);
        System.out.println(bug1.getPosition());
        bug1.move();
        System.out.println(bug1.getPosition());
        bug1.turn();
        bug1.move();
        System.out.println(bug1.getPosition());

    }

}
