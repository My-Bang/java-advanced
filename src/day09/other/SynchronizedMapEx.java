package day09.other;

import java.util.HashMap;
import java.util.Map;

public class SynchronizedMapEx {
    public static void main(String[] args) {
       // Map<Integer, String> map = Collections.synchronizedMap(new HashMap<>());
        Map<Integer, String> map = new HashMap<>();     // 스레드들의 경쟁으로 데이터의 접근이 안된 스레드는 객체를 쓰지 못한다.

        // 작업 스레드 객체 A생성
        Thread threadA = new Thread() {
            @Override
            public void run() {
                // 객체 1000 추가
                for (int i = 1; i <= 1000; i++) {
                    map.put(i, "내용" + i);
                }
            }
        };


        // 작업 스레드 객체 B생성
        Thread threadB = new Thread() {
            @Override
            public void run() {
                // 객체 1000 추가
                for (int i = 1001; i <= 2000; i++) {
                    map.put(i, "내용" + i);
                }
            }
        };
        // 작업 스레드 실행
        threadA.start();
        threadB.start();

        // 작업 스레드들이 모두 종료될 때까지 메인 스레드를 기다리게 할것임
        try {
            threadA.join();
            threadB.join();
        } catch (InterruptedException e) {
            System.out.println("외부 문제로 프로그램 종료");
        }catch (Exception e1){
            e1.printStackTrace();
        }

        // 저장된 총 객체 수 얻기
        int size = map.size();
        System.out.println("총 객체 수 : " + size);








    }

}
