package day01.test03;

public class Truck extends Wheeler {

    public Truck() {
    }

    public Truck(String carName, int velocity, int wheelNumber) {
        this.carName = carName;
        this.velocity = velocity;
        this.wheelNumber = wheelNumber;
    }

    @Override
    public void speedUp(int speed) {
        velocity += speed * 5;

        if (velocity > 100) {
            velocity = 100;
            System.out.println(carName + "의 최고 속도 위반으로 속도를 " + velocity + " 낮춥니다. .");

        }
        System.out.println(carName + "의 현재 속도는 " + velocity + " 입니다.");

    }

    @Override
    public void speedDown(int speed) {
        velocity -= speed * 5;
        if (velocity < 50) {
            velocity = 50;
            System.out.println(carName + "의 최저속도위반으로 속도를 " + velocity + "으로 올립니다.");
        }
    }
}
