package ru.geekbrains.java;

public class Employee {
    public static void main(String[] args) {

        new Employee("Jackson Peter", "Manager", "jackson3302@mail.com", 5553302, 2500, 28);
        persons();
    }

    private String fullname;
    private String position;
    private String email;
    private int numberphone;
    private int thesalary;
    private int age;

    public Employee(String fullname, String position, String email, int numberphone, int thesalary, int age) {

        this.fullname = fullname;
        this.position = position;
        this.email = email;
        this.numberphone = numberphone;
        this.thesalary = thesalary;
        this.age = age;

  //      System.out.println(" Employee Name: " + fullname + "; Position: " + position + "; Email: " + email +
  //              "; Number Phone: " + numberphone + "; The Salary: " + thesalary + "$; Возраст: " + age);
    }

    public int getAge() {
    return this.age;}

        public static void persons() {
            Employee[] persArray = new Employee[5];
            persArray[0] = new Employee("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", 892312312, 30000, 30);
            persArray[1] = new Employee("Petrov Igor", "Master", "igor2008@mail.com", 892651254, 35000, 42);
            persArray[2] = new Employee("Petrenko Artem", "Engineer", "petArt@mail.com", 892946768, 37500, 34);
            persArray[3] = new Employee("Ekimov Anton", "Technolog", "antonmov@mail.com", 892978658, 33000, 50);
            persArray[4] = new Employee("Protasov Jurii", "Engineer", "protjur1@mail.com", 892963054, 34500, 46);
            for ( Employee employee : persArray){
                if ( employee.getAge() > 40) employee.printInfo();

            }
    }
    private void printInfo() {
        System.out.println(" Employee Name: " + fullname + "; Position: " + position + "; Email: " + email +
                "; Number Phone: " + numberphone + "; The Salary: " + thesalary + "$; Возраст: " + age);
    }

    }










