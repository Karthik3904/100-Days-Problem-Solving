class GfG
{
    public static ArrayList<ArrayList<Integer>> uniqueRow(int a[][],int r, int c)
    {
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        
        for(int i=0;i<r;i++){
            ArrayList<Integer>al=new ArrayList<>();
            for(int j=0;j<c;j++){
               al.add(a[i][j]);
            }
             if(!ans.contains(al)) ans.add(al);
             
        }
        return ans;
    }
}
