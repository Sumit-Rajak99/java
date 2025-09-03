class Multimissnum{
    public static void main(String[] args) {
        
        int arr[] = {1, 3, 5, 7, 45, 55};
      
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i + 1] - arr[i] > 1) {

                for (int j = arr[i] + 1; j < arr[i + 1]; j++) {
                    System.out.println(j);
                }
            }
        }
    }
}
