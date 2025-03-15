class Solution {
    // Function to rotate matrix anticlockwise by 90 degrees.
    static void rotateby90(int mat[][]) {
        int n=mat.length;
        for(int i=0;i<n;i++){
           int st=0;
            int lst=n-1;
            while(lst>st){
                int temp=mat[i][st];
                mat[i][st]=mat[i][lst];
                mat[i][lst]=temp;
                st++;
                lst--;
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                int temp=mat[i][j];
                mat[i][j]=mat[j][i];
                mat[j][i]=temp;
            }
            
        }
        
    }
}
