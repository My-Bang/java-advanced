package day07.genericEx.ex01;

public class Box<T> {   // T는 Box의 인스턴스를 생성할 때 어떤 참조 타입으로 대체될 수 있는 타입 매개변수

    public T item;
    public int count = 0;   // item의 수를 추적하는 필드

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
        this.count++;
    }

    public int getCount() {
        return count;
    }
}
