package ru.geekbrains.java;

public class Persons {

    private String fullname;
    private String position;
    private String email;
    private int numberphone;
    private int thesalary;
    private int age;


    public static void main(String[] args) {

        Persons();
    }

    public int getAge() {
        return this.age;
    }


    public boolean isRetired() {
        return this.age >= 65;
    }

    public Persons(String fullname, String position, String email, int numberphone, int thesalary, int age) {

        this.fullname = fullname;
        this.position = position;
        this.email = email;
        this.numberphone = numberphone;
        this.thesalary = thesalary;
        this.age = age;
    }

    public static void Persons() {
        Persons[] persArray = new Persons[5];
        persArray[0] = new Persons("Ivanov Ivan Ivanovich", "Engineer", "ivivan@mailbox.com", 892312312, 55000, 30);
        persArray[1] = new Persons("Petrov Igor Alekseevich", "Master", "igor2008@mail.com", 892651254, 50000, 42);
        persArray[2] = new Persons("Petrenko Artem Valerievich", "Engineer", "petArt@mail.com", 892946768, 47500, 34);
        persArray[3] = new Persons("Ekimov Anton Grigorievich", "Technolog", "antonmov@mail.com", 892978658, 43000, 50);
        persArray[4] = new Persons("Protasov Jurii Aleksandrovich", "Engineer", "protjur1@mail.com", 892963054, 54500, 66);
        for (Persons persons : persArray) {
            if (persons.getAge() > 40)
                persons.printinfo();
                System.out.println(persons.isRetired());
        }
    }
        private void printinfo() {
      System.out.printf("persons %s, position: %s, email: %s, numberphone: %s, thesalary: %d$, age: %d\n", this.fullname, this.position, this.email, this.numberphone, this.thesalary, this.age);


    }
}






