class Solution {

    void printGfg(int N) {
        if(N==0){
            return;
        }
        System.out.print("GFG"+" ");
        printGfg(--N);
        
        // code here
    }
}
