package com.company;

class Calc {

    int summ(String[] operands, String[] operators) {

        int summ = Integer.parseInt(operands[0]);

        for (int i = 1; i < operands.length; i++) {
            if (operators[i].equals("+")) {
                summ += Integer.parseInt(operands[i]);
            } else if (operators[i].equals("-")) {
                summ -= Integer.parseInt(operands[i]);
            } else if (operators[i].equals("*")) {
                summ *= Integer.parseInt(operands[i]);
            } else {
                summ /= Integer.parseInt(operands[i]);
            }
        }
        return summ;
    }
}
