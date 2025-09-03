import java.util.Scanner;

class Weath {
    public static void main(String arge[]) {
        Scanner obj = new Scanner(System.in);

        double Fahrenheit;
        double celsius;

        System.out.println("Enter temperature in Celsius:");
        celsius = obj.nextDouble();

        Fahrenheit = (celsius * 9 / 5) + 32;

        System.out.println("Temperature in Fahrenheit: " + Fahrenheit + "°F");

        obj.close();
    }
}
