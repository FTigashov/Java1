package Homework;

public class HomeWorkApp {
    public static void main(String[] args) {
        checkSumSign();
        printColor();
        compareNumbers();
    }

    static void checkSumSign() {
        int a = 10;
        int b = 20;
        int sum = a + b;
        if (sum < 0) {
            System.out.println("Сумма отрицательная");
        }
        else if (sum == 0 || sum > 0) {
            System.out.println("Сумма положительная");
        }
    }

    static void printColor() {
        int value = 0;
        if (value <= 0) {
            System.out.println("Красный");
        }
        else if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        }
        else if (value > 100) {
            System.out.println("Зеленый");
        }
    }

    static void compareNumbers() {
        int a = 2;
        int b = 10;
        if (a >= b) {
            System.out.println("a >= b");
        }
        else {
            System.out.println("a < b");
        }
    }
}
