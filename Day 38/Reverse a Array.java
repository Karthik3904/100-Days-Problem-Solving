class Solution {

    
    void reverseInGroups(ArrayList<Long> arr, int k) {
         int n=arr.size();
        for (int i=0;i<n;i=i+k){
            int start=i;
            int end=Math.min(n-1,i+k-1);
            
            while(start<=end){
                long temp=arr.get(start);
                arr.set(start,arr.get(end));
                arr.set(end,temp);
                start++;
                end--;
            }
        }
        
    }
}
