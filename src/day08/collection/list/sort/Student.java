package day08.collection.list.sort;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Student implements Comparable<Student> {

    private int sno;
    private String name;
    private int kor;
    private int eng;
    private int math;

    public double getAve() {
        return (double) (this.kor + this.eng + this.math) / 3;
    }

    public int getTot() {
        return this.kor + this.eng + this.math;
    }
    public String getGrade(){
        int grade = (int) getAve() / 10;
        if (grade >= 9) return "A";
        else if (grade == 8) return "B";
        else if (grade == 7) return "C";
        else if (grade == 6) return "D";
        else return "F";
    }
    @Override
    public int compareTo(Student o) {

        if (this.getAve() > o.getAve()) {
            return 1;
        } else if (this.getAve() == o.getAve()) {
            if (this.sno > o.sno) {
                return 1;
            } else {
                return -1;
            }
        } else {
            return -1;
        }
    }

    @Override
    public String toString() {
        return sno +
                "\t" + name +
                "\t" + kor +
                "\t\t" + eng +
                "\t\t" + math +
                "\t\t" + getAve() +
                "\t" + getTot() +"\t\t"+ getGrade();
    }
}

