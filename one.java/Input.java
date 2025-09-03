import java.util.Scanner;

public class Input {
    public static void main(String args[]) {
        Scanner objv = new Scanner(System.in);

        System.out.println("Enter a character:");
        char e = objv.next().charAt(0);

        System.out.println("You entered: " + e);
    }
}
