import java.util.Scanner;
class Reversenumber{
    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);

        int num;
        int rv=0;

        System.out.println("enter any number:");
       num = obj.nextInt();

       while(num!=0){
        rv=(rv*10)+num%10;
        num=num/10;
        
       }
       System.out.println(rv);
    }
}