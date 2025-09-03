import java.util.Scanner;

class Ola {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 

        float distance, totalDistance, waitTime;
        float pricePerKm = 10;
        float totalcost = 0, hourlyCharge = 200;
        float driverCost = 0, discount = 0;

        System.out.print("Enter your one-way distance in km: ");
        distance = sc.nextFloat();

        System.out.println("The base price is 10 rs/km");

        System.out.print("Enter your wait time in hours: ");
        waitTime = sc.nextFloat();

        totalDistance = distance * 2;

        if (totalDistance <= 10) {
            totalcost = totalDistance * 10;
        } else if (totalDistance <= 20) {
            totalcost = 10 * 10 + (totalDistance - 10) * 15;
        } else if (totalDistance <= 30) {
            totalcost = 10 * 10 + 10 * 15 + (totalDistance - 20) * 20;
        } else if (totalDistance <= 40) {
            totalcost = 10 * 10 + 10 * 15 + 10 * 20 + (totalDistance - 30) * 25;
        } else if (totalDistance <= 50) {
            totalcost = 10 * 10 + 10 * 15 + 10 * 20 + 10 * 25 + (totalDistance - 40) * 30;
        } else {
            totalcost = 10 * 10 + 10 * 15 + 10 * 20 + 10 * 25 + 10 * 30 + (totalDistance - 50) * 35;
        }


        float waitCharges = waitTime * hourlyCharge;
        totalcost += waitCharges;


        if (totalDistance > 30) {
            discount = 100;
            totalcost -= discount;
        }

       
        driverCost = totalcost + discount;

        
       
         System.out.println("Round Trip Distance: " + totalDistance + " km");
         System.out.println("Driver's Total Earning (before discount):RS" + driverCost);
         System.out.println("Total Fare (after discount):RS" + totalcost);
         System.out.println("Discount Applied: RS" + discount);
         
        sc.close();
    }
}
