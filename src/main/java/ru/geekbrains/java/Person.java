package ru.geekbrains.java;

public class Person extends Employee {
    public Person(String fullName, String position, String email, int phone, int thesalary, int age) {
        super(fullName, position, email, phone, thesalary, age);
    }

    public static void main(String[] args) {
        Person person1;
        person1 = new Person("Jackson Peter", "Manager", "jackson3302@mail.com", 5553302, 2500, 28);
        person1.printing();
        if (person1.getAge() >= 65) {
            person1.printingInfo();}
                else if (person1.getAge() <= 65){
                    person1.printinginfo();
            }

        }
    }
