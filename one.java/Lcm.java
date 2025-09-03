import java.util.Scanner;
class Lcm{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        while (true) {
            if (max % a == 0 && max % b == 0) {
                System.out.println("LCM of " + a + " and " + b + " is: " + max);
                break;
            }
            max++;
        }
    }
}
