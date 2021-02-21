package com.company;

class Division extends Operation {
    Division(int num1, int num2) {
        super(num1, num2);
    }

    @Override
    void execute() {
        if ((((double) num1 / num2) % 1) == 0) {
            System.out.println(num1 + "/" + num2 + "=" + (num1 / num2));
        } else {
            System.out.println(num1 + "/" + num2 + "=" + ((double) num1 / num2));
        }
    }
}