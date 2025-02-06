package day04.interface04;

public class MAin {
    public static void main(String[] args) {
        C c = new C();
        B b = new B();

        action(b);
        action(c);

    }

    static void action(A a) {
        if (a instanceof B) {
            a.method1();

        } else if (a instanceof C c) {
           c.method2();

        }

    }
}
