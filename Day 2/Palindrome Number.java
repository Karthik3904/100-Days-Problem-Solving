class Solution {
    public boolean isPalindrome(int x) {
        long rev =0;
        int lastd;
        int temp=x;
        
        while(x>0){
            lastd= x % 10;
            x=x/10;
            rev=(rev*10)+lastd;
            if(rev> Integer.MAX_VALUE || rev < Integer.MIN_VALUE){
                return false;
            }

        }
        if(rev==temp){
            return true;
        }
        else{
            return false;
        }
        
    }
}
