import java.util.Scanner;

public class Exam020 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num;

        System.out.print("숫자입력 ==> ");
        num = s.nextInt();

        if (num % 3 == 0) {
            System.out.println("3의 배수입니다.");
        } else {
            System.out.println("3의 배수가 아닙니다.");
        }

        if (num % 5 == 0) {
            System.out.println("5의 배수입니다");
        } else {
            System.out.println("5의 배수가 아닙니다.");
        }

        if (num % 15 == 0) {
            System.out.println("3과 5의 배수 둘다 만족합니다");
        } else {
            System.out.println("3과 5의 배수 둘다 만족하지 않습니다.");
        }

        s.close();
    }
}