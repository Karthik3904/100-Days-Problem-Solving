class Solution {
    
    public static long minSum(int arr[], int n)
    {
         if(n==0) return 0;
         PriorityQueue<Integer> pq=new PriorityQueue<>();
         for(int num : arr){
             pq.add(num);
         }
         long a=0,b=0;
         while(!pq.isEmpty()){
             a*=10;
             a+=pq.poll();
             if(pq.isEmpty()) break;
             b*=10;
             b+=pq.poll();
             
         }
         return a+b;
    }
}
