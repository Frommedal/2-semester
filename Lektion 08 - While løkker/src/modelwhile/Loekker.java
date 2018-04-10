package modelwhile;

public class Loekker {
    public void udskriv1_10() {
        // System.out.println("1");
        // System.out.println("2");
        // System.out.println("3");
        // System.out.println("4");
        // System.out.println("5");
        // System.out.println("6");
        // System.out.println("7");
        // System.out.println("8");
        // System.out.println("9");
        // System.out.println("10");

    }

    public void udskriv1_10_iteration() {
        int i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }
    }

    public int summer() {
        int sum = 0;
        int i = 1;
        while (i <= 10) {
            sum = sum + i;
            i++;
        }
        return sum;

    }

    public int summer(int n) {
        int sum = 0;
        int i = 1;
        while (i <= n) {
            sum = sum + i;
            i++;
        }
        return sum;

    }

    public int multiplum(int a, int b) {
        int resultat = 0;
        int i = 0;
        while (i < a) {
            resultat = resultat + b;
            i++;
        }
        return resultat;

    }

    public int summerEven() {
        // TODO Exercise P5.1A
        int sum = 0;
        int i = 0;
        while (i <= 100) {
            sum = sum + i;
            i = i + 2;
            System.out.println(i);
        }
        return sum;

    }

    public int summerSquare() {
        // TODO Exercise P5.1B
        int resultat = 0;
        int i = 1;

        while (i <= 100) {
            resultat = resultat + i * i;
            i++;
        }
        return resultat;
    }

    public void allPowers() {
        // TODO Exercise P5.1C'
        double res = 0;
        int i = 1;

        while (i <= 20) {
            res = res + Math.pow(2, i);
            i++;

        }
        System.out.println(res);
    }

    public int sumOdd(int a, int b) {
        // TODO Exercise P51.D
        int sum = 0;

        while (a <= b) {
            if (a % 2 != 0) {
                sum = sum + a;
                a++;
                System.out.println(sum);
            } else {
                a++;
            }

        }
        return sum;

    }

    public int sumOfOddDigits(int number) {
        // TODO Exercise P5.1E
        // int i = 10;
        // int sum = 0;
        // int resultat = 0;
        //
        // while (number > 0) {
        // sum = number % i;
        // System.out.println(sum);
        // number = number / i;
        //
        // if (sum % 2 != 0) {
        // resultat = resultat + sum;
        //
        // }
        // }
        //
        // return resultat;

        // // Med String og charAt
        int sum = 0;
        int i = 0;
        String numberString = "" + number;
        while (i < numberString.length()) {
            int num = numberString.charAt(i) - 48; // char at skal der trækkes 48 fra pga // listen bag i bogen.
            if (num % 2 == 1) { // gør det samme den overover det hedder "if (sum % 2 != 0) {"
                sum = sum + num;
                System.out.println(num);
            }
            i++;

        }
        return sum;

    }
}
