package Homework;

public class HomeWorkApp {
    public static void main(String[] args) {

        System.out.println(consistIn(15, 10)); // Лежит ли сумма в пределах от 10 до 20
        typeOfVar(0);  // Положительное число или отрицательное. Вывод в консоль
        System.out.println(checkVar(0));  // Положительное число или отрицательное. Вывод в консоль Boolean
        printString("Hello there!", 5);  // Печатает строку в консоли n раз
        System.out.println(isLeapYear(2021));  // Проверяет високосный ли год
    }

    static boolean consistIn(int a, int b) {
        int sum = a + b;
        if (sum >= 10 && sum <= 20) {
            return true;
        }
        else {
            return false;
        }
    }

    static void typeOfVar(int a) {
        if (a < 0)
            System.out.printf("Число %d отрицательное%n", a);
        else
            System.out.printf("Число %d положительное%n", a);
    }

    static boolean checkVar(int a) {
        if (a >= 0) {
            return true;
        }
        else {
            return false;
        }
    }


    static void printString(String string, int num) {
        final int LIMIT_OF_PRINT = num;
        for (int i = 0; i < LIMIT_OF_PRINT; i++) {
            System.out.println("Num " + (i + 1) + ": " + string);
        }
    }

    static Boolean isLeapYear(int year) {
        if ((year % 4 == 0 && (year & 100) != 0) || (year % 100 == 0))
            return true;
        else
            return false;
    }






}
