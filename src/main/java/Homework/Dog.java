package Homework;

public class Dog extends Animal{
    private static int dogCounter = 0;

    public Dog() {
        dogCounter++;
    }
    public Dog(String name) {
        this.name = name;
        dogCounter++;
    }

    public void swimming(int distance) {
        int leftDistance = 0;
        if (distance <= 0) {
            System.out.println("Неверный ввод дистанции для расстояния!");
        }
        else if (distance > 0 && distance <= 10) {
            System.out.println(name + " проплыл " + distance + " м.");
        }
        else {
            leftDistance = distance - 10;
            System.out.printf("%s смог проплыть %d м.\nУ него осталось %d м.\n", name, 10, leftDistance);
        }
    }

    public void running(int distance) {
        int leftDistance = 0;
        if (distance <= 0) {
            System.out.println("Неверный ввод дистанции!");
        }
        else if (distance > 500) {
            leftDistance = distance - 500;
            System.out.printf("%s смог пробежать %d км.\nУ него осталось %s км.\n", name, 500, leftDistance);
        }
        else {
            System.out.printf("%s пробежал: %d\n", name, distance);
        }
    }

    public void getDogCounter() {
        System.out.println("Количество собак: " + dogCounter);
    }
}
