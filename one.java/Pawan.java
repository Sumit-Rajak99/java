import java.util.Scanner;
class Pawan{
     public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);

        int num;
        int rv=0;
        int copy;

        System.out.println("enter any number:");
       num = obj.nextInt();
        copy=num;
       while(num!=0){
         int digit=num%10;
        rv=(rv*10)+digit;
        num=num/10;
        
       }

       if(rv==copy){
        System.out.println("palindrom");
       }
       else{
        System.out.println("not a palindrom");
       }
       
    }
}