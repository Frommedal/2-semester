package opgave_4;

public class ChiliApp {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Chili c1 = new Chili("California Reaper", 3000000.0);
        Chili c2 = new Chili("Ghost Chili", 2000000.0);
        Chili c3 = new Chili("Så for Satan der er fart på", 1000.0);

        Measurable[] chiliMeasureables = { c1, c2, c3 };
        ChiliFilter chiliFilter = new ChiliFilter();
        System.out.println(chiliMeasureables.length);
        System.out.println("Chili 1 har en scoville på: " + c1.getMeasure());
        System.out.println("Chili gennemsnit med filter: " + Data.avgMedAccept(chiliMeasureables, chiliFilter));
        System.out.println(Data.max(chiliMeasureables));

    }

}
