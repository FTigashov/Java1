package Homework;

import java.util.Scanner;

public class HomeWorkApp {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws InterruptedException {
        int action;
        Cat[] allCats = new Cat[3];
        allCats[0] = new Cat("Борис", 5, false);
        allCats[1] = new Cat("Васька", 5, false);
        allCats[2] = new Cat("Тифа", 5, false);


        Plate plate = new Plate(50);
        plate.info();

        for (int i = 0; i < allCats.length; i++) {
            if (allCats[i].fullness == false && allCats[i].appetite < plate.food) {
                allCats[i].eat(plate);
                allCats[i].fullness = true;
                System.out.println("Кот " + allCats[i].name + " поел!");
            }
            else {
                System.out.println("Кот " + allCats[i].name + " не поел!");
            }
        }
        plate.info();
        System.out.println("Сколько еды добавить в тарелку?");
        action = sc.nextInt();
        plate.increaseFood(action);
        plate.info();

    }
}
