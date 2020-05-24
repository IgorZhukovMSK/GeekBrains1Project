package Lesson5;

public class Worker {
    String name;
    String position;
    String email;
    String phone;
    int salary;
    int age;

    public Worker(String name, String position, String email, String phone, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public void printWorker() {
        System.out.printf("name: %s; position: %s; email: %s; phone: %s; salary: %s; age: %s; \n", name, position, email, phone, salary, age);
    }
}
