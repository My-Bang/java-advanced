package day01.test01;

public abstract class Shape {
    protected double area;
    private String name;

    public void Shape() {
    }

    public Shape(String name) {
        this.name = name;
    }

    public double getArea() {
        return area;
    }


    public void setArea(double area) {
        this.area = area;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void calculationArea();

    public void print() {
        System.out.println(name+ "면적은 " + area);
    }

}
