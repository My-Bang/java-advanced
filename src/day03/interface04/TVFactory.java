package day03.interface04;

public class TVFactory extends Factory implements IWorkingTogether{
    public TVFactory(String name, int openHour, int closeHour) {
        super(name, openHour, closeHour);
    }

    @Override
    int makeProducts(char skill) {
        if (skill == 'A'){
            skill = 8;
        } else if (skill == 'B') {
            skill = 5;
        } else if (skill == 'C') {
            skill = 3;
        }else {
            skill = 1;
        }
        return skill * getWorkingTime();
    }

    @Override
    public int workTogether(IWorkingTogether partner) {
        return makeProducts('C');
    }
}
