class Solution {
    // Function to count the frequency of all elements from 1 to N in the array.
    public static void frequencyCount(int arr[], int N, int P) {
      // First, if the element is greater than N, set it to 0
             for(int i=0;i<N;i++){
            int val=arr[i]%(P+1);
            if(val<=N){
                arr[val-1]+=P+1;
            
            }
        }
        for(int i=0;i<N;i++){
            arr[i]/=(P+1);
        }
      
    }
}
