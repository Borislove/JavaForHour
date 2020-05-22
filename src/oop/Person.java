package oop;

public class Person {
    int height; //высота
    float weight; //вес

    void say(String str) {
        System.out.println(str);
    }


    Person(int height, float weight) {
        this.height = height;
        this.weight = weight;
    }

   Person(){
    }

}
