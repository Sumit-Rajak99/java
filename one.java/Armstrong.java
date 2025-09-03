import java.util.Scanner;

class Armstrong{
    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);

        

        System.out.println("enter any number");
       int  num=obj.nextInt();
        
        int sum=0;
        int copy=num;

        while(num!=0){
            int rv=num%10;
            sum=sum+(rv*rv*rv);
            num=num/10;
        }
        if(copy==sum){
            System.out.println("army");
        }
        else{
            System.out.println("not");
        }
    }
}


