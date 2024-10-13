class Solution
{
 int i=0;   
  public void printNos(int N)
    {
        //Your code here
        i++;
        System.out.print(i+" ");
        if(i==N)return ;
        printNos(N);
        
        
    }
}
