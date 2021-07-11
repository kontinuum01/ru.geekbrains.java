package ru.geekbrains.java;

public class Persons {
    public static void main(String[] args) {
        Employee[] persones = new Employee[5];
        persones[0] = new Employee("Ivanov Ivan Ivanovich", "Engineer", "ivivan@mailbox.com",892312312, 55000, 30);
        persones[1] = new Employee("Petrov Igor Alekseevich", "Master", "igor2008@mail.com", 892651254, 50000, 42);
        persones[2] = new Employee("Petrenko Artem Valerievich", "Engineer", "petArt@mail.com", 892946768, 47500, 34);
        persones[3] = new Employee("Ekimov Anton Grigorievich", "Technolog", "antonmov@mail.com", 892978658, 43000, 50);
        persones[4] = new Employee("Protasov Jurii Aleksandrovich", "Engineer", "protjur1@mail.com", 892963054, 54500, 66);

        for (Employee employee : persones) {
            if (employee.getAge() >= 40) {
                employee.printInfo();
                System.out.println(employee.isRetired());
            }
        }

        System.out.println("Counter: " + Employee.getCounter());


    }
}

