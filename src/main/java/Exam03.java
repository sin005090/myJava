public class Exam03 {
    public static void main(String[] args){

        for (int i = 1; i <=7; i++){
            int a = 0;

            if (i <= 4) {
                a = i;

            }else {
                a = 8 - i;
            }

            for (int k = 0; k < a; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}