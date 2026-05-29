import java.util.ArrayList;
import java.util.List;

public class ListExam2 {
    public static void main(String[] args) {
        // 1. List 인터페이스로 변수 a 정의 및 ArrayList로 구현
        List<Integer> list = new ArrayList<>();

        // 2. 데이터 저장 (1, 2, 3, 4, 5)
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        // 3. 2세대 반복문: 개선된 For 반복문 (Enhanced For Loop)
        // 장점: 반복 횟수를 직접 계산할 필요가 없어 가독성이 좋음
        System.out.println("--- 2세대 반복문 출력 ---");
        for (int add : list) {
            System.out.println("값 : " + add);
        }

        System.out.println(); // 줄바꿈

        // 4. 3세대 반복문: forEach + 람다식 (Java 1.8부터 지원)
        // 장점: 코드가 더 간결해지며 함수형 프로그래밍 스타일 적용 가능
        System.out.println("--- 3세대 반복문 출력 ---");
        list.forEach(add -> System.out.println("값 : " + add));
    }
}