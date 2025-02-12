package day08.collection.list.sort.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentTest {
    public static void main(String[] args) {
        Student 철수 = new Student(250123,"김철수");
        Student 영희 = new Student(240867,"최영희");
        Student 민영 = new Student(240867,"방민영");

//        int isBig = 철수.compareTo(영희);
//        System.out.println(isBig);


        List<Student> list = new ArrayList<>();
        list.add(철수);
        list.add(영희);
        list.add(민영);

        System.out.println("List 정렬 전");
        list.forEach(System.out::println);

        Collections.sort(list);
        System.out.println("List 정렬 후");
        list.forEach(System.out::println);

    }
}
