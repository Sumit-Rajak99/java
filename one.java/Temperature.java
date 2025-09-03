import java.util.Scanner;

class Temperature {
    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);

        char choice;
        double celsius, Fahrenheit;

        System.out.println("Enter your choice: 'T' for Fahrenheit to Celsius, 'F' for Celsius to Fahrenheit:");
        choice = obj.next().charAt(0);

        if (choice == 'T' || choice == 't') {
            System.out.println("Enter temperature in Fahrenheit:");
            Fahrenheit = obj.nextDouble();

            celsius = (Fahrenheit - 32) * 5 / 9;

            System.out.println("Temperature in Celsius: " + celsius);
        } 
        else if (choice == 'F' || choice == 'f') {
            System.out.println("Enter temperature in Celsius:");
            celsius = obj.nextDouble();

            Fahrenheit = (celsius * 9 / 5) + 32;

            System.out.println("Temperature in Fahrenheit: " + Fahrenheit);
        } 
        else {
            System.out.println("Invalid input");
        }

        
    }
}
