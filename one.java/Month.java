import java.util .Scanner;
class Month{
    public static void main(String,args[]){
        Scanner month=new Scanner(System.in);

        int month;

        System.out.println("enetr any year");
        month=month.nextInt();

        if(month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12){
            System.out.println("31");
        }
        else if(month==4 || month==6 || month==9 || month==11){
            System.out.println("31");
        }
        else if(month==2){
            System.out.println("28/29");
        }
    }
}