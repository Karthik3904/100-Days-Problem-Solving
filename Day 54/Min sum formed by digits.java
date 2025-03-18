/*Given an array of digits (values are from 0 to 9), find the minimum possible sum of two numbers formed from digits of the array. All digits of the given array must be used to form the two numbers.

Any combination of digits may be used to form the two numbers to be summed.  Leading zeroes are permitted.

If forming two numbers is impossible (i.e. when n==0) then the "sum" is the value of the only number that can be formed.


 

 

Example 1:

Input:
N = 6
arr[] = {6, 8, 4, 5, 2, 3}
Output:
604
Explanation:
The minimum sum is formed by numbers 
358 and 246*/





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
