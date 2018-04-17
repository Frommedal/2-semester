package opgave_1;

public class ChiliApp {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Chili c1 = new Chili("California Reaper", 3000000.0);
        Chili c2 = new Chili("Ghost Chili", 2000000.0);
        Chili c3 = new Chili("Så for Satan der er fart på", 1000.0);

        Measurable[] chiliMeasureables = { c1, c2, c3 };
        System.out.println(chiliMeasureables.length);
        System.out.println(c1.getMeasure());
        System.out.println(Data.avg(chiliMeasureables));
        System.out.println(Data.max(chiliMeasureables));
    }

}
