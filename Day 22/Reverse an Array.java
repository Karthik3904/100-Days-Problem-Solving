class Solution {
    public void reverseArray(int arr[]) {
         int i=0;
         int j=arr.length-1;
         while(i<j){
             int etemp = arr[i];
             arr[i]=arr[j];
             arr[j]=etemp;
             i++;
             j--;
         }
    }
}
