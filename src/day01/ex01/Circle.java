package day01.ex01;

import java.util.ArrayList;

public class Circle extends Shape{
    public static void main(String[] args) {
        ArrayList<Shape> shapes = new ArrayList<Shape>();
        shapes.add(new Rectangle());
        shapes.add(new Rectangle());
        shapes.add(new Rectangle());
        shapes.add(new Triangle());
        shapes.add(new Triangle());
        shapes.add(new Circle());

        shapes.forEach(System.out::println);
    }
}
