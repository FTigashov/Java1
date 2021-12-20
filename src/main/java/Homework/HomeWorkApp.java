package Homework;

public class HomeWorkApp {
    public static void main(String[] args) {
        Animal animal = new Animal();

        Cat cat = new Cat("Борис");
        Cat cat1 = new Cat("Барсик");
        Cat cat2 = new Cat("Васька");

        Dog dog = new Dog("Барбос");
        Dog dog1 = new Dog("Шарик");
        Dog dog2 = new Dog("Бобик");

        cat1.swimming();
        cat2.running(150);
        cat1.running(300);

        dog1.swimming(100);
        dog2.swimming(5);
        dog1.running(600);
        dog2.running(400);

        animal.getCounter();
        cat.getCatCounter();
        dog.getDogCounter();
    }
}
