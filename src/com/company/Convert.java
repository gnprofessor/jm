package com.company;

import org.jetbrains.annotations.NotNull;

import java.util.NavigableMap;
import java.util.TreeMap;

class Convert {

    private int[] arabic = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    private String[] roman = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};

    String[] romanToArabic(String[] operands) {
        for (int i = 0; i < operands.length; i++) {
            for (int j = 0; j < this.roman.length; j++) {
                if (operands[i].equals(this.roman[j])) {
                    operands[i] = String.valueOf(this.arabic[j]);
                }
            }
        }
        return operands;
    }

    @NotNull
    String intToRoman(int number) {
        StringBuilder result = new StringBuilder();
        for (Integer key : initMap.descendingKeySet()) {
            while (number >= key) {
                number -= key;
                result.append(initMap.get(key));
            }
        }
        return result.toString();
    }

    private static NavigableMap<Integer, String> initMap = new TreeMap<Integer, String>();

    static {
        initMap.put(100, "C");
        initMap.put(90, "XC");
        initMap.put(50, "L");
        initMap.put(40, "XL");
        initMap.put(10, "X");
        initMap.put(9, "IX");
        initMap.put(5, "V");
        initMap.put(4, "IV");
        initMap.put(1, "I");
    }
}
