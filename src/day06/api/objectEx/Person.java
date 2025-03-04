package day06.api.objectEx;

import lombok.Data;
import java.util.Objects;

// 데이터 전달을 위한 역할 : DTO(Data Transfer Object) 반복적으로 사용되는 코드를 줄이기 위해 java14 record 도입
// 정보의 단위 : record, row(행),
@Data
public class Person {
private final String name;
private final int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String name(){
        return this.name;
    }
    public int age(){return this.age;}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
