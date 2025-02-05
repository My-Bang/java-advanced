package day03.interface02;

public class Cat extends Tail implements Animal, Pet{

    public Cat() {
        length = 10;
    }

    @Override
    public void cry() {
        System.out.println("고양이 울다");
    }

    @Override
    public void paly() {
        System.out.println("고양이 논다");
    }

    public static void tail(){
        System.out.println("고양이 꼬리는" + length + "CM");
    }

}
