package opgave1dobbelarray;

public class DobbelArrayApp {

    public static void main(String[] args) {
        final int ROW = 8;
        final int COL = 8;
        int[][] values = new int[ROW][COL];

        // TODO udskriv values på tabel form

        for (int row = 0; row < values.length; row++) {
            for (int col = 0; col < values[row].length; col++) {
                System.out.print(values[row][col] + " ");
            }
            System.out.println();
        }

        // TODO lav ændringer i values så der står 5 på alle pladser
        for (int row = 0; row < values.length; row++) {
            for (int col = 0; col < values[row].length; col++) {
                values[row][col] = 5;
            }
        }

        // TODO udskriv values på tabel form
        System.out.println("");
        for (int row = 0; row < values.length; row++) {
            for (int col = 0; col < values[row].length; col++) {
                System.out.print(values[row][col] + " ");
            }
            System.out.println();
        }

        // TODO lav ændringer i values så den har skiftende 0'er og 1'er som på et
        // skakbræt
        System.out.println("");
        // boolean etNul = true;
        for (int row = 0; row < values.length; row++) {
            for (int col = 0; col < values[row].length; col++) {
                values[row][col] = (row + col) % 2;

                // if (etNul) {
                // values[row][col] = 0;
                // etNul = !etNul;
                // } else {
                // values[row][col] = 1;
                // etNul = !etNul;
                // }
                // }
                // if (values[row].length % 2 == 0) {
                // etNul = !etNul;

            }
        }

        // TODO udskriv values på tabel form
        System.out.println("");
        for (int row = 0; row < values.length; row++) {
            for (int col = 0; col < values[row].length; col++) {
                System.out.print(values[row][col] + " ");
            }
            System.out.println();
        }

        // TODO lav ændringer så alle elementer i nederste og øverste række samt første
        // og sidste søjle er 5 og resten skal være 2.

        for (int row = 0; row < values.length; row++) {
            for (int col = 0; col < values[row].length; col++) {
                if (row == ROW - 1 || row == 0 || col == COL - 1 || col == 0) {
                    values[row][col] = 5;

                } else {
                    values[row][col] = 2;
                }
            }
        }

        // TODO udskriv values på tabel form
        System.out.println("");
        for (int row = 0; row < values.length; row++) {
            for (int col = 0; col < values[row].length; col++) {
                System.out.print(values[row][col] + " ");
            }
            System.out.println();
        }

        // TODO beregn summen af alle tallene i values og udskriv denne.
        int sum = 0;
        int totalSum = 0;
        for (int row = 0; row < values.length; row++) {
            for (int col = 0; col < values[row].length; col++) {
                sum = sum + values[row][col];
            }
            System.out.println(sum);
            totalSum = totalSum + sum;
            sum = 0;
        }
        System.out.println(totalSum);

        // }
    }
}