class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        // code here
        ArrayList <Integer> list=new ArrayList<>();
        int lead=arr[arr.length-1];
        list.add(lead);
        for(int i=arr.length-2;i>=0;i--){
            if(lead<=arr[i]){
                lead=arr[i];
                list.add(0,lead); }
            }
            return list;
        }
        
        
   }
