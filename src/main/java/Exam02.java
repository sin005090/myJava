import java.util.Scanner;

public class Exam02 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String ss = s.nextLine();

        String var1 = ss.toLowerCase();
        var1 = var1.replaceAll(" ", "");

        System.out.println(var1);

        s.close();
    }
}