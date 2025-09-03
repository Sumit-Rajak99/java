
import java.util.Scanner;

class Functionprime{
    static int sum(int num) {
        int count;

        for(int i=1;i<=num;i++){
            if(num%i==0){
                count++;
            }
            else if(count==2){
                System.out.println("prime number");
            }
            else{
                System.out.println("not prime number");
            }
        }
        
    }
      
    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter any number:");
        int num = obj.nextInt();

        System.out.println(sum(num)); 

        
    }
}






