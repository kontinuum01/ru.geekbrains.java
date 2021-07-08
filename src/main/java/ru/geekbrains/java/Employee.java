package ru.geekbrains.java;

public class Employee {
    private static String fullname;
    private static String position;
    private static String email;
    private static int numberphone;
    private static int thesalary;
    private static int age;

    public static void main(String[] args) {

        new Employee("Jackson Peter", "Manager", "jackson3302@mail.com", 5553302, 2500, 28);
        print();


    }

    public Employee(String fullname, String position, String email, int numberphone, int thesalary, int age) {

        this.fullname = fullname;
        this.position = position;
        this.email = email;
        this.numberphone = numberphone;
        this.thesalary = thesalary;
        this.age = age;

    }
    private static void print(){
        System.out.println(" Employee Name: " + fullname + "; Position: " + position + "; Email: " + email +
                "; Number Phone: " + numberphone + "; The Salary: " + thesalary + "$; Age: " + age);
    }

    }













