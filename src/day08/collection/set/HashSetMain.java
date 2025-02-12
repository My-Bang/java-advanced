package day08.collection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetMain {
    public static void main(String[] args) {
        Set<Member> members = new HashSet<>();
        members.add(new Member("방민영", 27));
        members.add(new Member("방민일", 27));
        members.add(new Member("방민이", 27));
        members.add(new Member("방민삼", 27));
        members.add(new Member("방민사", 27));
        members.add(new Member("방민오", 27));


        for (Member member : members) {
            System.out.println(member.name);
        }
        // 객체를 반복자 Iterator 을 이용하여 처리
        Iterator<Member> iterator = members.iterator();
        while (iterator.hasNext()) {
            // 객체를 하나씩 꺼내오기
            Member member = iterator.next();
            System.out.println(member.name + " " + member.age);
            int size = members.size();
            System.out.println("현재 회원 수 :" + size);
            iterator.remove();

        }
    }

}

