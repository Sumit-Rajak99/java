import java.util.Scanner;

public class Man {
    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter any integer:");
        int a = obj.nextInt(); 

        // System.out.println("Enter a character:");
        // Character e = obj.next().charAt(0);

        System.out.println("Enter a float:");
        float f = obj.nextFloat();

        System.out.println("Enter a double:");
        Double d = obj.nextDouble();

        obj.nextLine(); 

        System.out.println("Enter a string:");
        String s = obj.nextLine();

        System.out.println(a + " " + " " + f + " " + d + " " + s);
    }
}
