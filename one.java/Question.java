import java.util.Scanner;
class Question {
    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);

        int num;

        System.out.println("enter number from 10 to 20");
        num = obj.nextInt();

        if (num > 10 && num < 20) {
            if (num % 2 == 0 && num % 3 == 0) {
                System.out.println(num);
            } else {
                System.out.println("invalid input");  
            }
        } else {
            System.out.println("invalid input");
        }
    }
}
