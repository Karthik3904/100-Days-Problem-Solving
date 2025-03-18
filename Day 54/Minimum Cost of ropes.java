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
