package Homework;

public class Cat extends Animal {

    private static int catCounter = 0;

    public Cat() {
        catCounter++;
    }
    public Cat(String name) {
        this.name = name;
        catCounter++;
    }

    public void swimming() {
        System.out.printf("%s не может плавать\n", name);
    }

    public void running(int distance) {
        int leftDistance = 0;
        if (distance <= 0) {
            System.out.println("Неверный ввод дистанции!");
        }
        else if (distance > 200) {
            leftDistance = distance - 200;
            System.out.printf("%s смог пробежать %d км.\nУ него осталось %s км.\n", name, 200, leftDistance);
        }
        else {
            System.out.printf("%s пробежал: %d\n",name,  distance);
        }
    }

    public void getCatCounter() {
        System.out.println("Создано кошек: " + catCounter);
    }
}
