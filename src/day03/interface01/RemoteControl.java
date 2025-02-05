package day03.interface01;

public interface RemoteControl {

    // 가장 큰 볼륨을 저장할 멤버 30값 할당
    // 가장 작은 볼륨을 저장할 멤버 0 할당
    public static final int MAX_VALUE = 30;
    int MIN_VALUE = 0;

    public abstract void turnOn();

    public abstract void turnOff();  // 바디 {}

    public abstract void setVolume(int volume); // 볼륨 셋팅

}
