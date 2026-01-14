import java.util.Scanner;
class Hcf{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = input.nextInt();
        
        System.out.print("Enter second number: ");
        int b = input.nextInt();

    
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        System.out.println("HCF of  two numbers is: " + a);
    }
}
