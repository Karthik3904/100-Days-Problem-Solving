class Solution {
    static Long[] lcmAndGcd(Long A , Long B) 
    {
            Long gcd = gcd(A,B);

            Long lcm  = (A*B)/gcd;
            Long [] ans = new Long[2];
            ans[0] = lcm;
            ans[1] = gcd;
            return ans;
    }
    static Long gcd(Long A, Long B){
            while(B!=0)
            {
                Long temp = B;
                B=A%B;
                A=temp;
            }
            return A;
    }
};
