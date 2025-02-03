package day01.inheritence.abstractex;

import day01.package2.C;
import day01.package2.D;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();

        dog.sound();
        cat.sound();
        anmalSound(dog);
        anmalSound(cat);
    }
    public static void anmalSound(Animal animal){
        if (animal instanceof Cat) {
            animal.sound(); // <--------재정의된 매서드 호출
        }
    }
}
