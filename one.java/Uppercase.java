import java.util.Scanner;

class Uppercase {
    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter any character:");
        char c = obj.next().charAt(0);

        if (c >= 'a' && c <= 'z') {
            
            System.out.println((char)(c - 32));
        } 
        else if (c >= 'A' && c <= 'Z') {

            System.out.println((char)(c + 32));
        } 
        else {
            System.out.println("Not an alphabet character.");
        }
    }
}
