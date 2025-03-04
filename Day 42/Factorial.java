class Solution {
    static int factorial(int n) {
        if(n==0 || n==1) return 1;
        int res=1;
        for(int i=2;i<=n;i++){
            res=res*i;
        }
        return res;
    }
}
