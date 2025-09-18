class Encap {
    // encapsulation =merge member variable into member function 
    int a;


    void set(int a){
        this.a = a;
        System.out.println(this.a); 
    }

    public static void main(String args[]){
        Encap obj = new Encap();
        obj.set(10);
    }
}
