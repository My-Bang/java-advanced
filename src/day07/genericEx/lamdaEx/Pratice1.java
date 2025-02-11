package day07.genericEx.lamdaEx;

import java.util.Arrays;
import java.util.List;

public class Pratice1 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "jane", "jack");
        names.forEach(name -> System.out.println(name));
    }
}
