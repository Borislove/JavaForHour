package oop;

public class Main {

    public static void main(String[] args) {

        Person person = new Person();
        person.height = 180;
        person.weight = 70.4f;

        person.say("Hi");

        System.out.println(person.height);

        Person person2 = new Person();
        person.height = 190;
        person.weight = 90.4f;

        System.out.println(person2.height);

        Person person3 = new Person(170, 78.0f);
        System.out.println(person3.height);

        Person person4 = new Person(); // пустой конструктор

        Student student = new Student(190, 80f, 3);
        System.out.println(student.course);
        System.out.println(student.height);
    }
}
