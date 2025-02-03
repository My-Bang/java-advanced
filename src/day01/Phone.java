package day01;

public class Phone {

    // 필드선언
    public String model;
    public String color;

    //public Phone(){}
    public Phone(String model, String color) {
        this.model = model;
        this.color = color;
        System.out.println("Phone (model, color) 생성자 실행");
    }

    // 메서드
    public void bell() {
        System.out.println("벨이 띠링띠링 울린다.");
    }

    public final void VolumeUp(){
        System.out.println("볼륨을 줄입니다.");
    }
}
