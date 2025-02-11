package day07.genericEx.pratices;
// 2. 어떤 타입의 배열을 받아 요소를 출력하는 제너릭 메서드 printArray를 작성하세요
public class GennericMethodEx {

        public static <T> void printArray(T[] array) {
            for (T element : array) {
                System.out.println(element);
            }
        }

        public static void main(String[] args) {
            Integer[] intArray = {1, 2, 3, 4, 5};
            printArray(intArray);

            String[] strArray = {"Hello", "Java", "World"};
            printArray(strArray);

            Double[] doublesArray = {3.14, 1.23, 2.345};
            printArray(doublesArray);
        }
    }

