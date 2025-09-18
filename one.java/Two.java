class Two {
   
//     int a;  
// void sum() {
//         System.out.println("sum function");
//     }

    
//     public static void main(String args[]) {
//         Two obj = new Two();  
//         obj.a = 10;             
//         System.out.println(obj.a); 
//         obj.sum();              
//     }

// encapsulation =merge member variable into member function /

int a;

void set(int a){
    this.a=a;
    System.out.println(this.a);
}
public static void  main(String args[]){
    Two obj=new TWo();
    obj.set(10);
}
}
