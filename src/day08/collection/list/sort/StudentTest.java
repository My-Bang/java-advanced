package day08.collection.list.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class StudentTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("입력할 학생 수를 입력하세요: ");
        int count = scanner.nextInt();

        List<Student> list = new ArrayList<>();

        for (int i = 0; i < count; i++) {

                System.out.print("학번: ");
                int sno = scanner.nextInt();
                System.out.print("이름: ");
                String name = scanner.next();
                System.out.print("점수 입력[국어, 영어, 수학]: ");
                int korean = scanner.nextInt();
                int english = scanner.nextInt();
                int math = scanner.nextInt();

                Student student = new Student(sno, name, korean, english, math);
                list.add(student);

        }
        System.out.println("**********************************************************************************************************\n");
        System.out.println("                                         ## 학사 관리 시스템 : 데이터 출력 ##                                         ");
        System.out.println("\n**********************************************************************************************************");
        System.out.println("\t학번\t\t이름\t\t국어\t\t영어\t\t수학\t\t평균\t\t합계");
        System.out.println("**********************************************************************************************************");        Collections.sort(list);

        Collections.sort(list);
        list.forEach(System.out::println);

        System.out.println();
        System.out.println("**********************************************************************************************************");
        System.out.println("                                                   ##  프로그램 종료 ##                                                   ");
        System.out.println("**********************************************************************************************************");
    }
}