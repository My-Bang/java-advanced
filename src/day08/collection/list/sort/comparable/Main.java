package day08.collection.list.sort.comparable;

import lombok.Data;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//사용자(User) 이름과 나이로 5명(객체)를 생성하고 나이순으로 정렬 한 후  사용자의 이름과 나이를 출력하시오
//ex) 홍길동 32세
//    임준오 48세
public class Main {
    public static void main(String[] args) {

        List<User> list = new ArrayList<>();
        list.add(new User("홍길동", 32));
        list.add(new User("임준오", 48));
        list.add(new User("임준영", 40));
        list.add(new User("임준일", 30));
        list.add(new User("이준일", 30));

        System.out.println("=====정렬 전=====");
        list.forEach(System.out::println);
        System.out.println();

        Collections.sort(list);
        System.out.println("====정렬 후=====");
        System.out.println();
        list.forEach(System.out::println);
    }
}

@Data
class User implements Comparable<User> {
    String name;
    int age;

    User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(User o) {
        if (this.age > o.age) {
            return 1;
        } else if (this.age == o.age) {
            if (this.name.charAt(0) > o.name.charAt(0)) {
                return 1;
            } else {
                return -1;
            }
        } else {
            return -1;
        }
    }
}
// List에 5명의 사용자 저장 후 정렬
// 정렬 리스트 출력


