class Solution {
    public int reverse(int x) {
        long rev =0;
        int lastd;
        
        while(x!=0){
            lastd= x % 10;
            x=x/10;
            rev=(rev*10)+lastd;
            if(rev> Integer.MAX_VALUE || rev < Integer.MIN_VALUE){
                return 0;
            }

        }
        return (int) rev;
        }
}
