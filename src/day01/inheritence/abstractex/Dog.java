package day01.inheritence.abstractex;

public class Dog extends Animal{
    @Override
    public void sound() {
        System.out.println("멍멍");   // 추상클래스의 부모를 가진 자식클래스에서는 부모가 구현해 놓지 않은 추상메서드를 반드시 구현해야 한다.
    }
}
