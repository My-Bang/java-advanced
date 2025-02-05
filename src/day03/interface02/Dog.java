package day03.interface02;

public class Dog extends Tail implements Animal,Pet{

    public Dog() {
        length = 5;
    }

    @Override
    public void cry() {
        System.out.println("강아지 울다");
    }

    @Override
    public void paly() {
        System.out.println("강아지 논다");
    }
    public static void tail(){
        System.out.println("강아지 꼬리는" + length + "CM");
    }
}
