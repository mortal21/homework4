package com.company;

class Multiplication extends Operation {
    Multiplication(int num1, int num2) {
        super(num1, num2);
    }

    @Override
    void execute() {
        System.out.println(num1 + "*" + num2 + "=" + (num1 * num2));
    }
}