package com.company;

class Arabic {

    private String[] operators;
    private String[] operands;

    Arabic(String line) throws Exception {

        this.operators = line.split("[0-9]+");
        for (int i = 0; i < this.operators.length; i++) {
            this.operators[i] = this.operators[i].trim();
        }

        this.operands = line.split("[+-/*]");
        for (int i = 0; i < this.operands.length; i++) {
            this.operands[i] = this.operands[i].trim();
            if (Integer.parseInt(this.operands[i]) < 1 || Integer.parseInt(this.operands[i]) > 10) {
                throw new Exception("Можно вводить только числа от 1 до 10");
            }
        }
    }

    int result() {
        return new Calc().summ(this.operands, this.operators);
    }
}
