class Solution {
    private int lowerbound(int arr[],int n ,int x){
        int low=0;
        int high=n-1;
        int ans=n;
        while(low<=high){
           int  mid=(low+high)/2;
            if(arr[mid]>=x){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;
        
    }
    public int rowWithMax1s(int arr[][]) {
        int cntmax=0;
        int index=-1;
        int n=arr.length;
        int m=arr[0].length;
        for(int i=0;i<n;i++){
            int cnt=m-lowerbound(arr[i],m,1);
            if(cnt>cntmax){
                cntmax=cnt;
                index=i;
            }
        }
        return index;
        
    }
}
