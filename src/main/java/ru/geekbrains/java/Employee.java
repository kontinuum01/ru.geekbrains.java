package ru.geekbrains.java;

public class Employee {
    private static int counter;
    private String fullName;
    private String position;
    private String email;
    private int phone;
    private int thesalary;
    private int age;

    public Employee(String fullName, String position, String email, int phone, int thesalary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.thesalary = thesalary;
        this.age = age;
        counter++;
    }

    public int getAge() {
        return age;
    }

    public static int getCounter() {
        return counter;
    }

    public boolean isRetired() {
        return this.age >= 65;
    }

    public void printInfo() {
        System.out.printf("Person: %s, position: %s, email: %s, phone: %s, salary: %d RUB, age: %d;\n", this.fullName, this.position, this.email, this.phone, this.thesalary, this.age);
    }
    public  void printing() {
        System.out.printf("Person: %s, position: %s, email: %s, phone: %s, salary: %d$, age: %d;\n", this.fullName, this.position, this.email, this.phone, this.thesalary, this.age);
    }

    public void printingInfo() {
        System.out.println("Pensioner");
    }

    public void printinginfo() {
        System.out.println("Is not a pensioner");
    }
}

