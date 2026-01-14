class Abstraction{
    
    int a;

//    Abstraction=nesseary information show and unesseary hide 
//    like name of variable is unesseary and name of function nesseary
    void set(int a){
        this.a = a;
        System.out.println(this.a); 
    }

    public static void main(String args[]){
        Abstraction obj = new Abstraction();
        obj.set(10);
    }
}
