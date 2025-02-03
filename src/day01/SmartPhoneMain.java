package day01;

public class SmartPhoneMain {
    public static void main(String[] args) {
        SmartPhone smartPhone = new SmartPhone("갤럭시", "화이트");


        // Phone 으로부터 상속받은 필드 읽어서 출력
        System.out.println(smartPhone.model +" "+ smartPhone.color);

        //SmartPone 의 필드 읽어서 출력
        System.out.println(smartPhone.wifi);

        //Phone 으로부터 상속받은 메소드 호출
        smartPhone.bell();

        // SmartPone 으로부터 상속받은 메소드 호출
        smartPhone.internet();
    }
}
