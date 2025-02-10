package day06.api.objectEx;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MemberMain {
    public static void main(String[] args) {

        Member m1 = new Member("신세종");
        Member m2 = new Member("신세종");
//        Member m3 = new Member("ssg3");
//        Member m4 = m1;

//        // 컴퓨터적인 관점
//        System.out.println(m1 == m2);  // 주소 비교 false
//
//        // 사용자 관점
//        System.out.println(m1.equals(m2));  // Object equals() 주소값을 비교하기 때문에 false
//
//        // 객체 인스턴스 마다 각기 다른 해시코드(주소) 값을 가지기 때문이다
        // 현재, Member클래스에서 equals()와 Hashcode()를 오버라이딩 했기 때문에 , 두 객체 필드 name의 해시코드를 반환값이다.
        System.out.println(m1.hashCode());
        System.out.println(m2.hashCode());

        // 순수 객체의 주소를 얻고 싶을때는
        System.out.println(System.identityHashCode(m1));
        System.out.println(System.identityHashCode(m2));

        // 리스트를 생성하고 두 객체 데이터 추가
        List<Member> members = new ArrayList<>();
        // ArrayList<Member> members1 = new ArrayList<>(); // 이렇게 해도 되지만 확장성이 위에 보다 떨어짐.

        members.add(m1);
        members.add(m2);
        System.out.println("현재 m클라우드 짐은 "+members.size()+"명의 회원이 존재합니다.");

        Set<Member> members1 = new HashSet<>();
        members1.add(m1);
        members1.add(m2);
        System.out.println("현재 m클라우드 짐은 "+members1.size()+"명의 회원이 존재합니다.");

        // Collection(HashMap, HashSet, HashTable)은 객체가 논리적으로 같은지를 비교할 때









        //        if (m1.equals(m2)){
//            System.out.println("동일한 회원입니다.");
//        }else {
//            System.out.println("동일한 회원이 아닙니다.");
//        }
    }
}
