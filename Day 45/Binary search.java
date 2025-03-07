class Solution {
    public int binarysearch(int[] arr, int k) {
        int n=arr.length;
        int l=0;
        int r=n-1;
        int ans=-1;
        while(l<=r){
            int mid=(l+r)/2;
            if(arr[mid]==k){
                ans=mid;
                r=mid-1;
            }
            else if(k>arr[mid]){
                l=mid+1;
            }
            else{
                r=mid-1;
            }
            
        }
        return ans;
    }
}
