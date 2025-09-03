import java.util.Scanner;

class Fivonachifunction {
    static void fivo(int num) {
        int first = 0;
        int sec = 1;
        int next;

        if (num >= 1) {
            System.out.println(first);
        }

        if (num >= 2) {
            System.out.println(sec);
        }

        for (int i = 2; i < num; i++) {
            next = first + sec;
            System.out.println(next);          
            first = sec;
            sec = next;
        }
    }

    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter any number : ");
        int num = obj.nextInt();

        fivo(num);
    }
}
