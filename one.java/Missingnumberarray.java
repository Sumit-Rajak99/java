class Missingnumberarray{
    public static void main(String[] args) {
        
      int arr[]={1,3,5,7,9,11};
      
      for(int i=0;i<arr.length-1;i++){
        if(arr[i+1]-arr[i]>1){
           System.out.println(arr[i]+1);
        }
      }
        
        
    }
}