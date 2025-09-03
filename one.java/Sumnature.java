import java.util.Scanner;

class Sumnature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int sum = 0;
        // int rv=1;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        System.out.println("sum of nature number" + sum);

    //   factor

//    for(int i=1;i<=n;++i){
//     if(n%i==0){
//         System.out.println(i);
//     }

//    }

    }
}
