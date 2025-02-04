package day02.exception.ex01;

public class Exception02 {
    public static void main(String[] args) {

        String[] stringarray = {"100", "1OO", null};  // 두번째는 소문자 엘 대문자 오 임
        for (int i = 0; i < stringarray.length+1; i++) {
            try {
                int value = Integer.parseInt(stringarray[i]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("배열 인덱스가 초과되었습니다." + e.getMessage());
            } catch (NumberFormatException | NullPointerException e) {
                System.out.println("실행에 문제가 있습니다." + e.getMessage());
            }
        }
    }
}
