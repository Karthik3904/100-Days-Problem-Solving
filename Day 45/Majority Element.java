class Solution {
    static int majorityElement(int arr[]) {
        int n =arr.length;
        if(n==1){
            return arr[0];
        }
        int size=n/2;
        for(int i=0;i<n-1;i++)
        {
            int temp=0;
            for(int j=i+1;j<=n;j++)
            {
               
               if(arr[i]==arr[j])
               {
                 temp=temp+1;
                 if(temp>=size)
                 {
                   return arr[i];
                 }
               }
            }
        }
        return -1;
        
    }
}
