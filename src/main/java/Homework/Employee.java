package Homework;

public class Employee {
    private String fullName;
    private String position;
    private String email;
    private int phone;
    private int salary;
    private int age;
    private static int counter = 0;

    public Employee(String fullName, String position, String email, int phone, int salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;

        counter++;
    }

    public String toString() {
        return String.format("Сотрудник: %s.\nДолжность: %s.\nВозраст: %s\nЕго контактные данные:\nтелефон: %s;\nпочта: %s.\nЗаработная плата: %s.\n", fullName, position, age, phone, email, salary);
    }

    public void printInfo() {
        System.out.println(this);
    }

    public int getAge() {
        return age;
    }
}
