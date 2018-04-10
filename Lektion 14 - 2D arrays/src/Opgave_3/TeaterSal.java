package Opgave_3;

import java.lang.reflect.Array;
import java.util.Scanner;

public class TeaterSal {
    public static void main(String[] args) {

        int[][] teaterSal = { { 10, 10, 10, 10, 10, 10, 10, 10, 10, 10 }, { 10, 10, 10, 10, 10, 10, 10, 10, 10, 10 },
                { 10, 10, 10, 10, 10, 10, 10, 10, 10, 10 }, { 10, 10, 20, 20, 20, 20, 20, 20, 10, 10 },
                { 10, 10, 20, 20, 20, 20, 20, 20, 10, 10 }, { 10, 10, 20, 20, 20, 20, 20, 20, 10, 10 },
                { 20, 20, 30, 30, 40, 40, 30, 30, 20, 20 }, { 20, 30, 30, 40, 50, 50, 40, 30, 30, 20 },
                { 30, 40, 50, 50, 50, 50, 50, 50, 40, 30 } };

        // udskrivArray(int[][] array) {
        for (int row = 0; row < teaterSal.length; row++) {
            for (int col = 0; col < teaterSal[row].length; col++) {
                System.out.print(teaterSal[row][col] + "  ");
            }
            System.out.println();
        }

        // købPlads() {

        for (int row = 0; row < teaterSal.length; row++) {
            for (int col = 0; col < teaterSal[row].length; col++) {
                // if () {

            }
        }

    }
}
