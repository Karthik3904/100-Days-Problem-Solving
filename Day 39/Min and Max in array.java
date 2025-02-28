class Solution {
    public Pair<Integer, Integer> getMinMax(int[] arr) {
         int n=arr.length;
         int min=arr[0];
         int max=arr[0];
         for(int i=0;i<n;i++){
             if(arr[i]>max)  max=arr[i];
             if(arr[i]<min)  min=arr[i];
             
         }
         Pair<Integer,Integer> res = new Pair(min,max);
         return res;
        
        
        // Code Here
    }
}
