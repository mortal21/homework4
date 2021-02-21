package com.company;

class Operation {
    int num1, num2;

    Operation(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    void execute() {
        System.out.println("Я родительский класс. Зачем ты меня вызвал?");
    }
}