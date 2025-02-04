package day02.test01;

import java.util.Scanner;

public class Prob1 {
    //필요할 경우 다음의 메서드 선언부분(메서드 시그너처)을 수정하시기 바랍니다.
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("숫자로 변환할 문자열을 입력바랍니다.");
        String str= scan.nextLine();
        int result= 0;
        //여기를 작성하십시오.
        try {
            System.out.println(convert(str));
        } catch (IllegalArgumentException e) {
            System.out.println("예외" + e.getMessage());        }
    }

    //필요할 경우 다음의 메서드 선언부분(메서드 시그너처)을 수정하시기 바랍니다.
    private static int convert(String str) {
        int num = 0;
        try {
            num = Integer.parseInt(str);
        } catch (IllegalArgumentException e) {
           if(str == null || str.isEmpty()){
                System.out.println();
            }

    }  return num;
    }

}