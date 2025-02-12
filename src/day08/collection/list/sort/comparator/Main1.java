package day08.collection.list.sort.comparator;

import lombok.Data;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//사용자(User) 이름과 나이로 5명(객체)를 생성하고 나이순으로 정렬 한 후  사용자의 이름과 나이를 출력하시오
//ex) 홍길동 32세
//    임준오 48세
public class Main1 {
    public static void main(String[] args) {

        @Data
        class User {
            private String name;
            private int age;

            User(String name, int age) {
                this.name = name;
                this.age = age;
            }


        }


        List<User> list = new ArrayList<>();
        list.add(new User("홍길동", 32));
        list.add(new User("임준오", 48));
        list.add(new User("임준영", 40));
        list.add(new User("임준일", 30));
        list.add(new User("이준일", 30));

        Collections.sort(list, Comparator.comparing(User::getAge));  // 나이순 정렬

        for (User user : list) {
            System.out.println(user.name + " " + user.age + "세");
        }

        System.out.println("===========================");
        Collections.sort(list, Comparator.comparing(User::getName));  // 이름 정렬
        for (User user : list) {
            System.out.println(user.name + " " + user.age + "세");
        }

        System.out.println("===========================");
        Collections.sort(list, Comparator.comparing(User::getAge).thenComparing(User::getName));
        for (User user : list) {
            System.out.println(user.name + " " + user.age + "세");
        }
    }
}


// List에 5명의 사용자 저장 후 정렬
// 정렬 리스트 출력


