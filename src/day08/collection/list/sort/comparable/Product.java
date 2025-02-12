package day08.collection.list.sort.comparable;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Product implements Comparable<Product> {
    private String product_name;
    private int price;

    @Override
    public int compareTo(Product o) {
        // return 값이 양수면 자리교환(이름순 오름차순), 0이거나 음수면 자리교환 없음
        // return this.product_name.charAt(0) > o.product_name.charAt(0) ? 1 : -1;

        // 이름순 내림차순
        // return this.product_name.charAt(0) < o.product_name.charAt(0) ? 1 : -1;

        // 전체 문자열 비교 정렬
        // return this.product_name.compareTo(o.product_name);

        if (this.product_name.charAt(0) > o.product_name.charAt(0)) {
            return 1;
        } else if (this.product_name.charAt(0) == o.product_name.charAt(0)) {
            if (this.price > o.price) {
                return 1;
            } else {
                return -1;
            }
        } else {
            return -1;
        }
    }
}
