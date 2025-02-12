package day08.collection.list.sort.comparator;

import lombok.Data;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//사용자(User) 이름과 나이로 5명(객체)를 생성하고 나이순으로 정렬 한 후  사용자의 이름과 나이를 출력하시오
//ex) 홍길동 32세
//    임준오 48세
public class Main {
    public static void main(String[] args) {

        @Data
        class User {
            String name;
            int age;

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

        Collections.sort(list, new Comparator<User>() {


            @Override
            public int compare(User o1, User o2) {
               // return Integer.compare(o1.age, o2.age);
            return o2.name.compareTo(o1.name); //이름(문자열)순으로 정렬하려면 compareTo 메서드로
            }
        });

        // 정렬 리스트 출력
        Collections.sort(list,(l1,l2) -> l1.name.compareTo(l2.name));  // 나이순 정렬
        for (User user : list) {
            System.out.println(user.name + " " + user.age + "세");

        }

    }
}


// List에 5명의 사용자 저장 후 정렬
// 정렬 리스트 출력


