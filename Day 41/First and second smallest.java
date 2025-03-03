class Solution {
    public int[] minAnd2ndMin(int arr[]) {
        if(arr.length<2){
            return new int[]{-1};
        }
        int smallest=Integer.MAX_VALUE;
        int secsmallest=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<smallest){
                secsmallest=smallest;
                smallest=arr[i];
            }
            else if(arr[i]>smallest && arr[i]<secsmallest){
                secsmallest=arr[i];
            }
        }
        if(secsmallest==Integer.MAX_VALUE){
            return new int[]{-1};
            
        }
        return new int[]{smallest,secsmallest};
        
    }
}
