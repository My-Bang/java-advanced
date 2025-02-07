package day05.innerClass.ex06;

import lombok.*;

@Builder // Lombok 빌더 적용
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Hamburger {
    private int bun;
    private int patty;
    private int cheese;
    private int lettuce;
    private int tomato;
    private int bacon;
}
