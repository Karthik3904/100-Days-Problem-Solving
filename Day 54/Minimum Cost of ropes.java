/*Input: arr[] = [4, 3, 2, 6]
Output: 29
Explanation: We can connect the ropes in following ways.
1) First connect ropes of lengths 2 and 3. Which makes the array [4, 5, 6]. Cost of this operation 2 + 3 = 5. 
2) Now connect ropes of lengths 4 and 5. Which makes the array [9, 6]. Cost of this operation 4 + 5 = 9.
3) Finally connect the two ropes and all ropes have connected. Cost of this operation 9 + 6 =15. Total cost is 5 + 9 + 15 = 29. This is the optimized cost for connecting ropes. 
Other ways of connecting ropes would always have same or more cost. For example, if we connect 4 and 6 first (we get three rope of 3, 2 and 10), then connect 10 and 3 (we gettwo rope of 13 and 2). Finally we connect 13 and 2. Total cost in this way is 10 + 13 + 15 = 38.*/








class Solution {
    // Function to return the minimum cost of connecting the ropes.
    public int minCost(int[] arr) {
        PriorityQueue <Integer> pq=new PriorityQueue<>();
        int cost=0;
        for(int length : arr){
            pq.add(length);
        }
        while(pq.size()>1){
            int first=pq.poll();
            int second=pq.poll();
            int combine=first+second;
            cost+=combine;
            pq.add(combine);
            
        }
        return cost;
    }
}
