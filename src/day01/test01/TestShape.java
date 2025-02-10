package day01.test01;

public class TestShape {
    public static void main(String[] args) {
        Shape[] shape = new Shape[2];
        shape[0] = new Circle("원",10);
        shape[1] = new Rectangular("직사각형", 20, 10);

        for (Shape s : shape) {
            s.print();
        }
    }
}
