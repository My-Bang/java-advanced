package day05.innerClass.ex06.test01;

public class Student {
    // 필수 멤버
    private int id;
    private String name;
    private String major;

    // 선택 멤버
    private String grade;
    private String phoneNumber;
    private String address;

    private Student(StudentBuilder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.major = builder.major;
        this.grade = builder.grade;
        this.phoneNumber = builder.phoneNumber;
        this.address = builder.address;
    }


    public static class StudentBuilder {
        private int id;
        private String name;
        private String major;

        private String grade = "freshman";
        private String phoneNumber = " ";
        private String address = " ";


        public StudentBuilder(int id, String name, String major) {
            this.id = id;
            this.name = name;
            this.major = major;
        }

        public Student.StudentBuilder addGrade(String grade){
            this.grade = grade;
            return this;
        }
        public Student.StudentBuilder addphoneNumber(String phoneNumber){
            this.phoneNumber = phoneNumber;
            return this;
        }
        public Student.StudentBuilder addaddress(String address){
            this.address = address;
            return this;
        }
        public Student build(){
            return new Student(this);
        }

    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", major='" + major + '\'' +
                ", grade='" + grade + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}

