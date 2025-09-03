
  import java.util.Scanner;

class Swapnumber {
    public static void main(String args[]) {
        Scanner swap = new Scanner(System.in);

        int a, b, temp;

        System.out.println("Enter frist number: ");
        a = swap.nextInt();

        System.out.println("Enter second number: ");
        b = swap.nextInt();

        
        temp = a;
        a = b;
        b = temp;

         System.out.println("after swaping")
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
