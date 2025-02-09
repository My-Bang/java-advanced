package day02.test01;

import java.util.Scanner;

public class Prob1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("숫자로 변환할 문자열을 입력바랍니다.");
        String str = scan.nextLine();

        try {
            System.out.println(convert(str));
        } catch (IllegalArgumentException e) {
            if (str == null || str.isEmpty()) {
                System.out.println("예외가 발생되었습니다. 문자열을 입력하지 않고 Enter키를 누르셨습니다");
            }
        }
    }

    private static int convert(String str) throws IllegalArgumentException {
        return Integer.parseInt(str);
    }

}