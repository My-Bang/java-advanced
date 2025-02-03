package day01;

import day01.package2.C;

public class PromotionMain {

    public static void main(String[] args) {
        Cat cat = new Cat();
        Animal animal = new Cat();
        // cat과 anmal 변수만 타입만 다를뿐이지 동일한 Cat 객체를 참조한다.
        System.out.println(cat == animal);
    }

}
