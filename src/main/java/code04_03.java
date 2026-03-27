import java.util.Scanner;

public class code04_03 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        int n1 = 1;
        int n2 = 2;

        double result = (double) n1 / n2;

        System.out.println(n1+n2);
        System.out.println(n1-n2);
        System.out.println(n1*n2);

        System.out.println(n1 + " / " + n2 + " = " + result);
    }
}
