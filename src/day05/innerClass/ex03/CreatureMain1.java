package day05.innerClass.ex03;
class Creatur1{
    int life;

    class Animal1{

    }
    public void method(){
        Animal1 animal1 = new Animal1();
    }
}

public class CreatureMain1 {
    public static void main(String[] args) {
        Creatur1 creatur1 = new Creatur1();
        creatur1.method();
    }

}
