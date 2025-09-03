import java.util.Scanner;

class Functionsum {
    static int sum(int num) {
        int ans = 0;
        for (int i = 1; i <= num; i++) {
            ans = ans + i; 
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
