class Solution {
    public static boolean matSearch(int mat[][], int x) {
         int n = mat.length;
        int m = mat[0].length;
        
        int i = 0;
        int j = m-1;
        
        while( i<n && j>=0){
            
            if( mat[i][j] == x) return true;
            if( mat[i][j] < x ) i++;
            else if(mat[i][j] > x) j--;
        }
        return false;
    
    }
}
