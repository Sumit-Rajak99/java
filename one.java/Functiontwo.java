import java.util.Scanner;

class Functiontwo {
    static int sum() {
        int a = 10;
        int b = 20;
        return a + b;
    }

    static int sub() {
        int a = 50;
        int b = 5;
        return a - b;
    }

    static int multiply() {
        int a = 5;
        int b = 7;
        return a * b;
    }

    static int divide() {
        int a = 50;
        int b = 5;
        return a / b;
    }

    static int mode() {
        int a = 50;
        int b = 5;
        return a % b;
    }

    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);

        System.out.println("Sum: " + Functiontwo.sum());
        System.out.println("Subtraction: " + Functiontwo.sub());
        System.out.println("Multiplication: " + Functiontwo.multiply());
        System.out.println("Division: " + Functiontwo.divide());
        System.out.println("Modulus: " + Functiontwo.mode());
    }
}
