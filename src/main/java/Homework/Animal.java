package Homework;

public class Animal {
    String name;
    private static int counter = 0;

    public Animal() {
        counter++;
    }

    public Animal(String name) {
        this.name = name;
        counter++;
    }

    public String printInfo() {
        return "Animal: " + name;
    }


    public void getCounter() {
        System.out.println("Количество животных: " + counter);
    }


}
