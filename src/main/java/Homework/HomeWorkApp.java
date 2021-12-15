package Homework;

public class HomeWorkApp {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Иван Иванов", "старший разработчик", "email@email.com", 89999999, 100000, 30);
        Employee employee2 = new Employee("Василий Васильев", "разработчик", "email@email.com", 89999999, 100000, 41);
        Employee employee3 = new Employee("Петр Петров", "ит-аналитик", "email@email.com", 89999999, 100000, 45);
        Employee employee4 = new Employee("Василиса Васильева", "менеджер", "email@email.com", 89999999, 120000, 31);
        Employee employee5 = new Employee("Анастасия Петрова", "менеджер", "email@email.com", 89999999, 120000, 29);

        Employee[] employeesArray = {employee1, employee2, employee3, employee4, employee5};
        for (Employee employee : employeesArray) {
            if (employee.getAge() > 40) {
                employee.printInfo();
            }
        }
    }
}
