package com.company;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        boolean continueCycle = true;
        while (continueCycle) {
            char mathSymbol = 0;
            boolean isMathSymbol = false;
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите выражение: число, знак действия (+,-,*,/), число");

            // Ввод 1 числа
            int num1 = input();

            // Ввод математического знака
            while (!isMathSymbol) {
                System.out.print("Введите знак (+,-,*,/): ");
                mathSymbol = sc.next().charAt(0);
                if (mathSymbol == '+' || mathSymbol == '-' || mathSymbol == '*' || mathSymbol == '/') {
                    isMathSymbol = true;
                } else {
                    System.out.println("Введенное значение не является знаком действия (+,-,*,/). Повторите ввод");
                }
            }

            // Ввод 2 числа
            int num2 = input();

            // В зависимости от введенного знака выбираем действие
            switch (mathSymbol) {
                case '+':
                    Addition a = new Addition(num1, num2);
                    a.execute();
                    break;
                case '-':
                    Subtraction s = new Subtraction(num1, num2);
                    s.execute();
                    break;
                case '*':
                    Multiplication m = new Multiplication(num1, num2);
                    m.execute();
                    break;
                case '/':
                    if (num2 == 0) {
                        System.out.println("На 0 делить нельзя");
                        break;
                    }
                    Division d = new Division(num1, num2);
                    d.execute();
                    break;
                default:
                    return;
            }

            System.out.println("Для выхода введите 'stop'. Для продолжения введите любую букву/слово");

            // Если введено 'stop', то выходим из цикла и завершаем программу
            if (sc.next().equals("stop")) {
                continueCycle = false;
            }
        }
    }

    // Функция для ввода целочисленного значения
    static int input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        while (!sc.hasNextInt()) {
            System.out.println("Введенное значение не является целым числом");
            System.out.print("Введите целое число: ");
            sc.next();
        }
        return sc.nextInt();
    }
}