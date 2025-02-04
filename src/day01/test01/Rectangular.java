package day01.test01;

public class Rectangular extends Shape {

    private double width;
    private double hight;

    @Override
    public void calculationArea() {
        this.area = this.width * this.hight;
    }

    public Rectangular(String name, double width, double hight) {
        super(name);
        this.width = width;
        this.hight = hight;
        calculationArea();
    }
}


