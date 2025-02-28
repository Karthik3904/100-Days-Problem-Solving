class Solution {
    static int evenlyDivides(int n) {
        int temp=n;
        int c=0;
        while(n>0){
            int d=n%10;
             
            
            if(d!=0 && temp%d==0){
                c++;
                
            }
            n=n/10;
           
        }
        return c;
    }
}
