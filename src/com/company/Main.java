package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String arabicPattern = "^\\d{1,2}\\s?(\\+|-|/|\\*|)\\s?\\d{1,2}$";
        String romanPattern = "^((M{0,3})(D?C{0,3}?|C[DM])(L?X{0,3}|X[LC])(V?I{0,3}|I[VX]))\\s?(\\+|-|/|\\*|)\\s?" +
                "((M{0,3})(D?C{0,3}?|C[DM])(L?X{0,3}|X[LC])(V?I{0,3}|I[VX]))$";

        String line;

        Scanner in = new Scanner(System.in);

        System.out.println("Input:");
        line = in.nextLine().toUpperCase();
        try {
            if (line.isEmpty()) throw new Exception("Ошбика - пустое поле");
            if (line.matches(arabicPattern)) {
                System.out.println("Output:");
                Arabic out = new Arabic(line);
                System.out.println(out.result());
            } else if (line.matches(romanPattern)) {
                System.out.println("Output:");
                Roman out = new Roman(line);
                System.out.println(out.result());
            } else {
                throw new Exception("Можно вводить только числа от 1 до 10 или от I до X");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
