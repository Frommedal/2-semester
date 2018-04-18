package opgave_4;

public class SoegningApp {

    public static void main(String[] args) {
        Soegning s = new Soegning();

        // Kode til afprøvning af opgave 1
        int[] talArray = { 2, 2, 4, 8, 2, 13, 16, 20, 20, 10 };
        System.out.println("Er der et ulige tal i talArray ? " + s.findUlige(talArray));
        talArray[2] = 15;
        System.out.println("Er der et ulige tal i talArray ? " + s.findUlige(talArray));

        // Her tilføjes kode til at afprøve opgaverne 2,3,5,6 og 7

        System.out.println(s.numeroUno(talArray));
        System.out.println(s.findToVenner(talArray));
    }

}
