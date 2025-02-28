package day09.lambda.ex04;

import day09.lambda.ex03.Person;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        Computer computer = new Computer();

        person.action(Computer::staticMethod);
        //person.action((x,y)-> Computer.staticMethod(x,y));

        person.action(computer::instanceMethod);
        //person.action((x,y)->computer.instanceMethod(x,y));
    }
}
