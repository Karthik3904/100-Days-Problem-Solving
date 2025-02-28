class Solution {
    public boolean isSubset(int a[], int b[]) {
        HashMap<Long,Integer>freqMap=new HashMap<>();
        for(long element:a){
            freqMap.put(element,freqMap.getOrDefault(element,0)+1);
        }
        for(long element:b){
            if(freqMap.getOrDefault(element,0)>0){
                freqMap.put(element,freqMap.get(element)-1);
            }
            else{
                return false;
            }
        }
        return true;
    }
}
