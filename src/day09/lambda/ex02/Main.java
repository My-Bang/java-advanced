package day09.lambda.ex02;
// 홍길동씨가 프로그래밍을 합니다. 출력
// "프로그래밍은 정말 재미있어" 말합니다. 출력

// 황가람은 가수 입니다. 출력
// "저는 오랜 무명생활로 고생을 했답니다. 여러분 저를 사랑해주셔서 감사합니다." 출력
// "반딧불" 노래를 부릅니다.
public class Main {
    public static void main(String[] args) {
        Person person = new Person("황가람", "가수", "저는 오랜 무명생활로 고생을 했답니다. 여러분 저를 사랑해주셔서 감사합니다.","반딧불");
        person.action((name, job) -> System.out.println(name + "은 " + job + "입니다."));
        person.action2(System.out::println);
        person.action3(((sing) -> System.out.println(sing + " 노래를 부릅니다.")));

        System.out.println();

        Person person1 = new Person("조수미", "오페라가수", "저를 오랫동안 사랑해주셔서 감사합니다.","밤의 아리아");
        person1.action((name, job) -> System.out.println(name + "는 " + job + "입니다."));
        person1.action2(System.out::println);
        person1.action3(((sing) -> System.out.println(sing + " 노래를 부릅니다.")));

    }

}
