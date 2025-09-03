import java.util.Scanner;

class Meter {
    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);

        int unit;
        int amount = 0;

        System.out.println("Enter meter unit:");
        unit = obj.nextInt();  

        if (unit >0 && unit <= 49) {
            amount = unit * 10;
        } 
        else if (unit >= 50 && unit <= 99) {
            amount = (49 * 10) + (unit - 49) * 20;
        } 
        else if (unit >= 100 && unit <= 149) {
            amount = (49 * 10) + (50 * 20) + (unit - 99) * 30;
        } 
        else if (unit >= 150 && unit <= 200) {
            amount = (49 * 10) + (50 * 20) + (50 * 30) + (unit - 149) * 40;
        } 
        else {
            System.out.println("Unit out of range (0–200)");
            
        }

        System.out.println("your amount is " + amount);
       
    }
}
