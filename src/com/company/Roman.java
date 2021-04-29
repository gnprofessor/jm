package com.company;

import org.jetbrains.annotations.NotNull;

class Roman {

    private String[] operators;
    private String[] operands;

    Roman(@NotNull String line) {
        this.operators = line.split("[A-Z]+");
        for (int i = 0; i < this.operators.length; i++) {
            this.operators[i] = this.operators[i].trim();
        }

        this.operands = line.split("[+-/*]");
        for (int i = 0; i < this.operands.length; i++) {
            this.operands[i] = this.operands[i].trim();
        }
    }

    String result() {
        Convert convert = new Convert();
        operands = convert.romanToArabic(this.operands);
        return convert.intToRoman(new Calc().summ(this.operands, this.operators));
    }
}
