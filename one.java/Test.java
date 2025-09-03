// // import java.util.Scanner;

// // class Test {
//     // public static void main(String args[]) {
//     //     Scanner obj = new Scanner(System.in);

//     //     int num;
//     //     int count = 0;

//     //     System.out.println("Enter any number: ");
//     //     num = obj.nextInt();

//     //     for (int i = 1; i <= num; i++) {
//     //         if (num % i == 0) {
//     //             count++;
//     //         }
//     //     }

//     //     if (count == 2) {
//     //         System.out.println(num + " is a Prime Number");
//     //     } else {
//     //         System.out.println(num + " is Not a Prime Number");
//     //     }
//     // }

// //     import java.util.Scanner;

// // class Test {
// //     public static void main(String args[]) {
// //         Scanner obj = new Scanner(System.in);

// //         int num;
// //         int first = 0;
// //         int sec = 1;
// //         int next;

// //         System.out.println("Enter any number: ");
// //         num = obj.nextInt();

// //         if (num == 0) {
// //             System.out.println("Please enter a positive number.");
// //         } else if (num == 1) {
// //             System.out.println("Fibonacci series: " + first);
// //         } else {
// //             System.out.print("Fibonacci series: " + first + " " + sec);

// //             for (int i = 2; i < num; i++) {
// //                 next = first + sec;
// //                 System.out.print(" " + next);
// //                 first = sec;
// //                 sec = next;
// //             }
// //         }
// //     }
// // }

// // // }

// import java.util.Scanner;
// class Test{
//     static int sum(int num){
//         int ans=0;

//         for(int i=1;i<=num;i++){
//             if(num%i==0){
//                 System.out.println(i);
//             }
//         }
//         return ans;
//     }

//     public static void main(String args[]){
//         Scanner obj=new Scanner(System.in);

//         int num;
//         System.out.println("enetr number");
//         num=obj.nextInt();

//         System.out.println(sum(num));
//     }
// }

import java.util.Scanner;

class Test {
    static boolean isPerfect(int num) {
        int sum = 0;

        // Find divisors (excluding the number itself)
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum += i;
            }
            if (sum==num) {
            System.out.println( " is a Perfect Number");
        } else {
            System.out.println(num + " is Not a Perfect Number");
        }
        }

        return sum == num;
    }

    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = obj.nextInt();

        
    }
}
