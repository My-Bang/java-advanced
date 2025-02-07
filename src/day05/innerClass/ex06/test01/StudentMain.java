package day05.innerClass.ex06.test01;


public class StudentMain {
    public static void main(String[] args) {
        Student student1 = new Student.StudentBuilder(123, "홍길동","컴공").build();
        System.out.println(student1);

        Student student2 = new Student.StudentBuilder(321, "김길동","기공").addGrade("A").build();
        System.out.println(student2);

//        Student student3 = new Student.StudentBuilder(321, "박길동","예체능").addGrade("B").addphoneNumber("010-9876-5432").build();
//        System.out.println(student3);

    }

}
