package day01.test01;

public class Circle extends Shape{
    private double radius;
    @Override
    public void calculationArea() {
      setArea(Math.PI * radius*radius);
    }

    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
        calculationArea();
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
