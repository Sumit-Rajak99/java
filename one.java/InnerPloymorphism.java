 class Ploymorphism {

    void sum(){
        system.out.println("sum one");
    }
    
}
class one extends Ploymorphism  {
void sum(){
    System.out.println("two sum");
}
  public static void main(String[] args) {
    Two obj=new Two();
    obj.sum();
  }   
}

// ploymorphism is a two type=1.compile time plomorphism 2.run time ploymorphism 

// function overlaoding is compile time ploymorphism  
// reason= because we difine manualy



//  function overiding is a run time ploymorphism         
