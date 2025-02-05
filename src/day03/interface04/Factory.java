package day03.interface04;

public abstract class Factory {
    int openHour;
    int closeHour;
    String name;

    public Factory(String name, int openHour, int closeHour) {
        this.name = name;
        this.openHour = openHour;
        this.closeHour = closeHour;

    }
    String getFactoryName(){
        return name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    int getWorkingTime(){
        return closeHour - openHour;
    }
    abstract int makeProducts(char skill);

}
