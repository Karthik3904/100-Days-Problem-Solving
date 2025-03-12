class Solution {
    public int reverseExponentiation(int n) {
        int rev=0;
        int temp=n;
        if(n==0){
            return rev;
        }
        while(temp!=0){
            int lastd=temp%10;
            rev=(rev*10)+lastd;
            temp=temp/10;
        }
        return (int) Math.pow(n,rev);
    }
}
