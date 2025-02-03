package day01;

public class CarMain {
    public static void main(String[] args) {
        Car mycar1 = new Car();
        for (int i = 0; i < 3; i++) {
            mycar1.speedUp();
        }
        System.out.println(mycar1.speed);
        mycar1.stop();
        System.out.println(mycar1.speed);


        SportCar mycar2 = new SportCar();
        for (int i = 0; i < 5; i++) {
            mycar2.speedUp();
        }
        System.out.println(mycar2.speed);
        mycar2.stop();
        System.out.println(mycar2.speed);

    }
}
