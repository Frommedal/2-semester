package opgave_4;

public class Data {
    public Data() {
    }

    public static double max(Measurable[] objects) {
        double max = Double.MIN_VALUE;
        for (int i = 0; i < objects.length; i++) {
            if (max < objects[i].getMeasure()) {
                max = objects[i].getMeasure();
            }

        }
        return max;
    }

    public static double avg(Measurable[] objects) {

        double average = 0;
        for (int i = 0; i < objects.length; i++) {
            average += objects[i].getMeasure();
        }
        return average / objects.length;
    }

    public static double avgMedAccept(Measurable[] objects, Filter object) {
        double average = 0;
        int number = 0;

        for (int i = 0; i < objects.length; i++) {
            if (object.accept(objects[i]) == true) {
                average += objects[i].getMeasure();
                number++;
            }
        }
        return average / number;
    }

}
