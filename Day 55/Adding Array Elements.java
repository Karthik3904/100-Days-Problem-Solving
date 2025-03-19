/*Input:
N = 6, K = 6 
Arr[] = {1, 10, 12, 9, 2, 3}
Output: 2
Explanation: First we add (1 + 2), now the
new list becomes 3 10 12 9 3, then we add
(3 + 3), now the new list becomes 6 10 12 9,
Now all the elements in the list are greater
than 6. Hence the output is 2 i:e 2 operations
are required to do this. 
Example 2:

Input:
N = 4, K = 4
Arr[] = {5, 4, 6, 4}
Output: 0
Explanation: Every element in the given array 
is greater than or equal to K.*/



class Solution {
    int minOperations(int[] arr, int n, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        int ans=0;
        for(int element : arr){
            pq.add(element);
            
        }
        while(pq.peek()<k){
            int a=pq.poll();
            if(pq.isEmpty()) return -1;
            int b=pq.poll();
            pq.add(a+b);
            ans++;
        }
        return ans;
    }
}
