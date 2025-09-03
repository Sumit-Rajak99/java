import java.util.Scanner;

class Functionperfact{
    static int sum(int num) {
        
        int ans=0;

        for (int i = 1; i < num; i++) {
           if(num%i==0){
              ans=ans+i;
           }

       else if(num==ans){
        System.out.println("perfact nunber");
       }        
       else {
        System.out.println("not perfact number");
       }
        }
        return ans;
    }

    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter any number:");
        int num = obj.nextInt();

        System.out.println(sum(num));
    }
}
