package day09.lambda.ex03;

// Person 클래스는 Calculable을 매개변수로 갖는 calculate메소드를 갖고 있다.
// Calculate 메소드는 Calculate 인터페이스를 매개변수로 갖는 메소이다
public class Person {
    private int x;
    private int y;



    public void action(Calculable calculate) {

       double result = calculate.calculate(20,5);
        System.out.println("결과 : " + result);
    }
}
