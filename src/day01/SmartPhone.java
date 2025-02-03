package day01;

public class SmartPhone extends Phone {

    // 필드선언
    public boolean wifi;

    // 생성자 선언
    public SmartPhone(String model, String color){
        super();
        this.model = model;
        this.color = color;     // Phone으로부터 상속받은 필드
    }
    public void setWifi(boolean wifi){
        this.wifi = wifi;
        if (this.wifi != false) internet();
    }
    public void internet(){
        System.out.println("인터넷을 연결합니다.");
    }



}
