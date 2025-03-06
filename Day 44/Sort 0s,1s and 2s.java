class Solution {
    // Function to sort an array of 0s, 1s, and 2s
    public void sort012(int[] arr) {
         int n=arr.length;
         if(n<=1)
         return;
         int c0=0;
         int c1=0;
         int c2=0;
         for(int num:arr){
             if(num==0) c0++;
             if(num==1) c1++;
             if(num==2) c2++;
         }
            for(int i=0;i<n;i++){
                if(c0>0){
                    arr[i]=0;
                    c0--;
                 }
            else if(c1>0 && c0==0){
                    arr[i]=1;
                    c1--;
                }
            else if(c2>0 && c1==0){
                 arr[i]=2;
                 c2--;
            }
            
             
            }
             
         
    }
}
