package day07.genericEx.pratices;

//3. Compareable<T> 를 확장하는 타입의 두 객체를 비교하는
//제너릭 메소드 compareTo를 작성하세요. 이 메서드를 이용하여 두 숫자를 비교하세요
public class BoundedGenericMethod {

//        public static <T extends Comparable<T>> T max(T a, T b){
//            return a.compareTo(b) > 0 ? a : b;
//        }
//
//        public static void main(String[] args) {
//            System.out.println(day07.genericEx.ex03.extendsEx.CompareUtil.max(5,10));
//        }


        public static <T extends Comparable<T>> int compareTo(T a, T b) {
            return a.compareTo(b);
        }

        public static void main(String[] args) {

        }
    }




