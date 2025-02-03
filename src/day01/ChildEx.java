package day01;

public class ChildEx {
    public static void main(String[] args) {
        Parent parent = new Child();
        parent.field1 = "data";
        parent.method1();
        parent.method2();

        Child child = (Child) parent;

//        parent.field2 = "data_value";
//        parent.method3();

    }
}
