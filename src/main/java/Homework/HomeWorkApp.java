package Homework;

import java.util.Arrays;

public class HomeWorkApp {

    public static void main(String[] args) {
        int[] mydata = {2, 2, 2, 1, 2, 2, 10, 1};
        int[] testArray = {1, 2, 3};
        System.out.println("Задание 1");
        replaceOneAndZero();
        System.out.println("Задание 2");
        emptyArray();
        System.out.println("Задание 3");
        multiplyOnTwo();
        System.out.println("Задание 4");
        rectArray();
        System.out.println("Задание 5");
        System.out.println(Arrays.toString(returnArray(5, 1)));
        System.out.println("Задание 6");
        findMaxAndMin();
        System.out.println("Задание 7");
        System.out.println(sumEqualInArray(mydata));
        System.out.println("Задание 8");
        shiftArray(testArray, 5);
        shiftArray(testArray, -5);
    }


    private static void replaceOneAndZero() {
        int[] data = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println("Текущий массив: " + Arrays.toString(data));
        for (int i = 0; i < data.length; i++) {
            data[i] = data[i] == 1 ? 0 : 1;
        }
        System.out.println("Измененный массив: " + Arrays.toString(data));
    }

    private static void emptyArray() {
        int[] data = new int[100];
        int n = 1;
        for (int i = 0; i < data.length; i++) {
            data[i] = n;
            n++;
        }
        System.out.println(Arrays.toString(data));
    }

    private static void multiplyOnTwo() {
        int[] data = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < data.length; i++) {
            data[i] = data[i] < 6 ? data[i] * 2 : data[i];
        }
        System.out.println(Arrays.toString(data));
    }

    private static void rectArray() {
        int n = 5;
        int[][] data = new int[n][n];
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                data[i][j] = i == j ? 1 : 0;
            }
            for (int j = n - 1; j >= 0; j--) {
                if ((i + j) == (n - 1))
                    data[i][j] = 1;
            }

        }
        for (int[] datum : data) {
            for (int i : datum) {
                System.out.printf("%2s ", i);
            }
            System.out.println();
        }
    }

    private static int[] returnArray(int len, int initialValue) {
        int[] data = new int[len];
        for (int i = 0; i < len; i++) {
            data[i] = initialValue;
        }
        return data;
    }

    private static void findMaxAndMin() {
        int[] data = new int[10];
        int max = 0, min = 14;
        for (int i = 0; i < data.length; i++) {
            data[i] = (int)(Math.random() * 15);
            max = Math.max(max, data[i]);
            min = Math.min(min, data[i]);
        }
        System.out.println("Массив: " + Arrays.toString(data));
        System.out.printf("Максимальное число в массиве: %d%n", max);
        System.out.printf("Минимальное число в массиве: %d%n", min);
    }

    private static boolean sumEqualInArray(int[] data) {
        int len = data.length;
        boolean result = false;
        //System.out.println(Arrays.toString(data));
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < len; i++) {
            sum1 += data[i];
            for (int j = i + 1; j < len; j++) {
                sum2 += data[j];
            }
            //System.out.println("sum1 = " + sum1 + "\tsum2 = " + sum2);
            if (sum1 == sum2)
                result = true;
            else
                sum2 = 0;
        }
        return result;
    }

    private static void shiftArray(int[] data, int n) {
        System.out.println("Текущий массив: " + Arrays.toString(data));
        int len = data.length;
        int cur, prev, next;
        if (n > 0) {
            for (int i = 0; i < n; i++) {
                for (int j = len - 1; j >= 0; j--) {
                    cur = data[j];
                    prev = j - 1;
                    if (j - 1 < 0)
                        prev = 0;
                    data[j] = data[prev];
                    data[prev] = cur;
                }
            }
            System.out.println("Массив со сдвигом вправо на " + n + ": " + Arrays.toString(data));
        }
        else {
            n *= -1;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < len - 1; j++) {
                    cur = data[j];
                    next = j + 1;
                    if (j + 1 > len -1)
                        next = 0;
                    data[j] = data[next];
                    data[next] = cur;
                }
            }
            System.out.println("Массив со сдвигом влево на " + n + ": " + Arrays.toString(data));
        }

    }




}




