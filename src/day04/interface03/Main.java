package day04.interface03;

/* 자식인터페이스를 구현한 클래스는 자식 인터페이스의 메소드 뿐만 아니라 부모의 인터페이스의 모든
 추상메소드를 재정의 해야하며, 구현객체는 자식 및 부모인터페이스 변수에 대입될 수 있다.

 자식 인터페이스 변수 = new 구현클래스();
 부모 인터페이스1 변수 = new 구현클래스();
 부모 인터페이스2 변수 = new 구현클래스();
 구현 객체가 자식인터페이스 변수에 대입되면, 자식 및 부모 인터페이스의 추상 메소드를 모두 호출 가능
 부모인터페이스 변수에 대입되면 부모인터페이스에 선언된 추상 메소드만 호출이 가능하다.*/

public class Main {
    public static void main(String[] args) {
        ABCImpl abcImpl = new ABCImpl();
        InterfaceA ia = abcImpl;
        ia.methodA();

        InterfaceB ib = abcImpl;
        ib.methodB();

        InterfaceC ic = abcImpl;
        ic.methodC();
        ic.methodB();
        ic.methodA();
    }
}


