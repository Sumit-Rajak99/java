import java.util.Scanner;

class Month1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int month;

        System.out.println("Enter any month number:");
        month = sc.nextInt();

        if (month == 1 || month == 3 || month == 5 || month == 7 || 
            month == 8 || month == 10 || month == 12) {
            System.out.println("31");
        } 
        else if (month == 4 || month == 6 || month == 9 || month == 11) {
            System.out.println("30");   
        } 
        else if (month == 2) {
            System.out.println("28/29");
        } 
        else {
            System.out.println("Invalid input");
        }
    }
}
