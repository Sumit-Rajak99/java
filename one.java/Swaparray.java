class Swaparray{
    public static void main(String[] args) {
        
        int arr[] = {1, 3, 5, 7, 45, 55};

        int start=0;
        int end=arr.length-1;

        while(start<arr.length/2){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;

            start++;
            end--;
        }
        for(int i:arr){
            System.out.println(i);
        }
}
}
