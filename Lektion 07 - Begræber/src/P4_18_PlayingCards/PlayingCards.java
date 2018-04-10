package P4_18_PlayingCards;

import java.util.Scanner;

public class PlayingCards {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String input = scan.toString();
        String number = null;
        String type = null;

        System.out.print("Enter card notation: ");
        input = scan.nextLine().toUpperCase();

        if (input.subSequence(0, 1).equals("1")) {
            number = "Ace";
        } else if (input.subSequence(0, 1).equals("2")) {
            number = "Two";
        } else if (input.subSequence(0, 1).equals("3")) {
            number = "Tree";
        } else if (input.subSequence(0, 1).equals("4")) {
            number = "Four";
        } else if (input.subSequence(0, 1).equals("5")) {
            number = "Five";
        } else if (input.subSequence(0, 1).equals("6")) {
            number = "Six";
        } else if (input.subSequence(0, 1).equals("7")) {
            number = "Seven";
        } else if (input.subSequence(0, 1).equals("8")) {
            number = "Eight";
        } else if (input.subSequence(0, 1).equals("9")) {
            number = "Nine";
        } else if (input.subSequence(0, 1).equals("10")) {
            number = "Ten";
        } else if (input.subSequence(0, 1).equals("J")) {
            number = "Jack";
        } else if (input.subSequence(0, 1).equals("Q")) {
            number = "Queen";
        } else if (input.subSequence(0, 1).equals("K")) {
            number = "King";
        } else {
            number = "Unknown";
        }

        if (input.subSequence(1, 2).equals("D")) {
            type = "Diamonds";
        } else if (input.subSequence(1, 2).equals("H")) {
            type = "Hearts";
        } else if (input.subSequence(1, 2).equals("S")) {
            type = "Spades";
        } else if (input.subSequence(1, 2).equals("C")) {
            type = "Clubs";
        } else {
            type = "Unknown";
        }
        scan.close();
        if (type.equals("Unknown") || number.equals("Unknown")) {
            System.out.println("Unknown");
        } else {
            System.out.println("Your card is: " + number + " of " + type);
        }

    }

}
