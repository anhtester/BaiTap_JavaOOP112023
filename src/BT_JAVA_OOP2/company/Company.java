package BT_JAVA_OOP2.company;

import BT_JAVA_OOP2.person.Person;

public class Company {
    public static void main(String[] args) {

        Person person = new Person(
                "Hiển",
                26,
                "Nam",
                "0123456789",
                "Hà Nội"
        );

        System.out.println(person.name);
        System.out.println(person.age);
        System.out.println(person.gender);

    }
}
