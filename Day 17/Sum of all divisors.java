class Solution{
    static long sumOfDivisors(int N){
             // Write Your Code here
        long sum=0;
        for(int i=1;i<=N;i++){
            sum +=(N/i)*i;
        }
        return sum;
      
    }
};
