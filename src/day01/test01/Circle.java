package day01.test01;

public class Circle extends Shape {
    private double radius;

    @Override
    public void calculationArea() {
        this.area = this.radius * this.radius * Math.PI;
    }

    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
        calculationArea();
    }


}
