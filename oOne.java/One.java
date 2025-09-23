interface i1 {
 void sum();
//  abstract=no function body
    
}

public class One implements i1 {
    public void sum(){
System.out.println("sum one");
    }

    public static void main(String[] args) {
        One obj=new One();
        obj.sum();
    }
}
