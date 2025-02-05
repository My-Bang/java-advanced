package day03.interface03;

public class Dog extends Animal {
    public Dog(int speed) {
        super(speed);

    }

    @Override
    void run(int hours) {
        setDistance(getDistance() + (this.getSpeed()*hours)/2.0);

    }
}
