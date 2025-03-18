class Solution {
    static long maxDiamonds(int[] A, int N, int K) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int num : A){
            pq.add(num);
        }
        long res=0;
        while(K-- >0){
            int max=pq.poll();
            res+=max;
            pq.add(max/2);
            
        }
        return res;
    }
};
