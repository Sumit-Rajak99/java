import java.util.Scanner;
class Functionoverloding{
    static void sum(int num){
       int sum = 0;
        int copy=num;
        int rv = 0;
        while (num != 0) {
           rv = num % 10;
           sum = sum + (rv * rv * rv);
           num = num / 10;
        }     

        if (copy == sum) {
            System.out.println(copy + " is a Armstrong number.");
        } else {
            System.out.println(copy + " is not a Armstrong number.");
        }
    }
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);

        System.out.println("enter any number:");
        int num=obj.nextInt();
        
        sum(num);
    }

}