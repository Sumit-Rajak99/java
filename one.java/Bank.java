// class Bank{
//     int adhar_no;
//     int name;
//     int contact_no;
//     int city;

//     void cus(int adhar_no){
//         adhar_no=873424379479;
//         name="sumit rajak";
//         contact_no=89289948;
//         city="bhopal";
//     }
//     void cus1 extand cus(int adhar_no){
//         adhar_no=87342;
//         name="pawan verma";
//         contact_no=892894329;
//         city="bhopal";
//     }
//     void cus1 extand cus(int adhar_no){
//         adhar_no=87342;
//         name="pawan verma";
//         contact_no=892894329;
//         city="jaipur";
//     }
//     void cus2 extand cus1(int adhar_no){
//         adhar_no=8734255;
//         name="raj verma";
//         contact_no=892894329;
//         city="jaipur";
//     }
//     public static void main(String[] args) {
//         Acount obj = new Acount();
//         obj.cus();  
//         obj.cus1();
//         obj.cus2();
//     }
// }

class Bank {
    long adhar_no;
    String name;
    long contact_no;
    String city;

}

// First Customer
class Customer1 extends Bank {
    Customer1() {
        adhar_no = 873424379479L;
        name = "Sumit Rajak";
        contact_no = 89289948L;
        city = "Bhopal";
    }
}

// Second Customer
class Customer2 extends Bank {
    Customer2() {
        adhar_no = 87342L;
        name = "Pawan Verma";
        contact_no = 892894329L;
        city = "Bhopal";
    }
}

// Third Customer
class Customer3 extends Bank {
    Customer3() {
        adhar_no = 8734255L;
        name = "Raj Verma";
        contact_no = 892894329L;
        city = "Jaipur";
    }
}

public class Account {
    public static void main(String[] args) {
        Customer1 c1 = new Customer1();
        Customer2 c2 = new Customer2();
        Customer3 c3 = new Customer3();

        c1.displayCustomer();
        c2.displayCustomer();
        c3.displayCustomer();
    }
}
