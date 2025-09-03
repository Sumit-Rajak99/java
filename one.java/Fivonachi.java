import java.util.Scanner;
class Fivonachi {
    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);
        int num;
        int first = 0;
        int sec = 1;
        int next;

        System.out.println("enter any number:");
        num = obj.nextInt();

       if(first==0){
                System.out.println(first);
               
             }
             else if(sec==1){
                System.out.println(sec);
                
             }
        for (int i = 2; i<num; i++) {
            
            
            next = first + sec;
            
            first = sec;
            sec = next;
             System.out.println(next);
        }
    }
}
 



  