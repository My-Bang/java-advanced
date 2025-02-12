package day08.collection.set;


public class Member {

    public String name;
    public int age;

    public Member(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        // name과 age가 같다면 true 리턴
        if (o instanceof Member target){
            return target.name.equals(name) && (target.age == age);
        }else return false;
    }

    @Override
    public int hashCode() {
        return name.hashCode() + age;
    }
}
