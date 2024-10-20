class Solution {
    public int getSecondLargest(int[] arr) {
        // Code Here
        int max1=arr[0];
        int max2=arr[0];
        for(int i=1;i<arr.length;i++){
            if (arr[i]>max1){
                max2=max1;
                max1=arr[i];
                
            }
            else if(arr[i]<max1){
                if(max1==max2){
                    max2=arr[i];
                }
                else if(arr[i]>max2){
                    max2=arr[i];
                }
                
            }
        }
        if(max1==max2){
            return -1;
        }
        else{
            return max2;
        }
    }
}
