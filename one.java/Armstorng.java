import java.util.Scanner;
class Armstrong {
    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);

        int num;
        int sum = 0;
        int copy;
        int digits = 0;
        
        System.out.print("Enter any number: ");
        num = obj.nextInt();

        copy = num; 
        
        while (num != 0) {
           digits = num % 10;
           sum = sum + (digits * digits * digits);
           num = num / 10;
        }     

        if (copy == sum) {
            System.out.println(copy + " is an Armstrong number.");
        } else {
            System.out.println(copy + " is not an Armstrong number.");
        }
    }
}
