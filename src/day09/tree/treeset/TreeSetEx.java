package day09.tree.treeset;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetEx {
    public static void main(String[] args) {
        // TreeSet 컬렉션 생성
        TreeSet<Integer> scores = new TreeSet<>();

        scores.add(87);
        scores.add(98);
        scores.add(75);
        scores.add(95);
        scores.add(89);
        for (Integer score : scores) {
            System.out.println(score + "점");
        }
        System.out.println("우리반 꼴등 : " + scores.first());
        System.out.println("우리반 일등 : " + scores.last());
        System.out.println("95점 기준 바로 아래 점수 : " + scores.lower(95));
        System.out.println("95점 기준 바로 위 점수: " + scores.higher(95));
        System.out.println("95점 : " + scores.floor(85));
        System.out.println("95점 : " + scores.ceiling(85));

        // 내림차순 정렬하기
        NavigableSet<Integer> descScores = scores.descendingSet();
        for (Integer descScore : descScores) {
            System.out.println(descScore);
        }
        System.out.println();

        // 점수기준 범위 검색 (80 <= )
        NavigableSet<Integer> rangeSet = scores.tailSet(80,true);
        for (Integer i : rangeSet) {
            System.out.println(i);
        }
        System.out.println();
        // 범위 검색
        rangeSet = scores.subSet(80,true,90,false);
        for (Integer i : rangeSet) {
            System.out.println(i);

        }









    }
}
