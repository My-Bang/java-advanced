package day01;

public class SmartPhone extends Phone {

    // 필드선언
    public boolean wifi;

    // 생성자 선언
    public SmartPhone(String model, String color) {
        super(model, color);    // 반드시 작성
//        this.model = model;
//        this.color = color;     // Phone으로부터 상속받은 필드
    }

    public void setWifi(boolean wifi) {
        this.wifi = wifi;
        if (this.wifi != false) internet();
    }

    public void internet() {
        System.out.println("인터넷을 연결합니다.");
    }

    @Override
    public void bell() {
        System.out.println("기존 벨소리");
        super.bell();   // 공동작업 처리 기법을 이용
        System.out.println("추가된 벨소리");
        System.out.println("벨이 띠링띠리링~ 울린다.");
    }


}
