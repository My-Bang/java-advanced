package day03.interface04;

public class CarFactory extends Factory implements IWorkingTogether{

    public CarFactory(String name, int openHour, int closeHour) {
        super(name, openHour, closeHour);
    }


    @Override
    int makeProducts(char skill) {
        if (skill == 'A'){
            skill = 3;
        } else if (skill == 'B') {
            skill = 2;
        } else if (skill == 'C') {
            skill = 1;
        }else {
            skill = 0;
        }

        return skill * getWorkingTime();
    }

    @Override
    public int workTogether(IWorkingTogether partner) {
        return makeProducts('B');
    }
}
