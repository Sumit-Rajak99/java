import java.util.Scanner;
class Loop {
    public static void main(String args[]) {
     Scanner obj = new Scanner(System.in);
        

        // do while is the exist loop 

        // do {
        //     System.out.println(2 * i);
        //     i++;
        // } while (i <= 10);


    //  while is the entry control loop 
        // while(i<=10){
        //     System.out.println(i*2);
        //     i++;
        // }

        // for loop is the entry control loop 




        System.out.println("Enter any number:");
        int n = obj.nextInt();

        int sum = 0;

        for (int i = 1; i <= n; i++) {
            int ans = i * n;
            System.out.println(ans);
            sum += ans;
        }

        System.out.println("Sum of multiples = " + sum);
    


        
    }
}
