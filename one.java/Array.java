// import java.util.Scanner;
// class Array{
//     public static void main(String args[]){
//         Scanner obj = new Scanner(System.in);

//         int arr[] = {4, 7, 2, 9, 1};
//         int max = arr[0];   

//         for(int i = 0; i < arr.length; i++){
//             if(arr[i] > max){
//                 max = arr[i];
//             }
//         }

//         System.out.println( max);
//     }
// }


// min 

import java.util.Scanner;
class Array{
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        int arr[]={10, 20, 30, 40, 50,60};
        int rv=0;
        for(int i=0;i<arr.length;i++){
            rv=(rv*10)+arr[i]/10;
        }
        System.out.println(rv);
    }
}
