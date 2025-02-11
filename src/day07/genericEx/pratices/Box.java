package day07.genericEx.pratices;
// 1. 어떤 타입의 객체든 저장할 수 있는 제너릭 클래스 Box. 객체를 설정하고 가져오는 메소드를 구현하세요
// Box 클래스를 확장하여 값이 특정 타입인지 확인 메서드

public class Box<T> {

    private T object;

    public void setObject(T object) {
        this.object = object;
    }

    public T getObject() {
        return object;
    }

    public boolean isOfType(Class<?> clazz) {

        return clazz.isInstance(object);
    }


    public static void main(String[] args) {
        Box<Integer> integerBox = new Box<>();
        integerBox.setObject(10);
        System.out.println("int 값 : " + integerBox.getObject());
        System.out.println(integerBox.isOfType(Integer.class));

        Box<String> stringBox = new Box<>();
        stringBox.setObject("Hello, World!");
        System.out.println("String 값 : " + stringBox.getObject());
        System.out.println(integerBox.isOfType(Integer.class));


    }
}






