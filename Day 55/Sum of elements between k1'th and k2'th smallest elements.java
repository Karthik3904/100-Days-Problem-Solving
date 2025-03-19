/*Input:
N  = 7
A[] = {20, 8, 22, 4, 12, 10, 14}
K1 = 3, K2 = 6
Output:
26
Explanation:
3rd smallest element is 10
6th smallest element is 20
Element between 10 and 20 
12,14. Their sum = 26.*/

class Solution { 
    public static long sumBetweenTwoKth(long A[], long N, long K1, long K2)
    {
        Arrays.sort(A);
        int front=(int)K1;
        int back=(int)K2 -1;
        long sum=0;
        for(int i=front;i<back;i++){
            sum+=A[i];
        }
        return sum;
        
    }
    
}
