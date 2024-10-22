class Solution {
    // Function to return a list containing the union of the two arrays.
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        // add your code here
        ArrayList<Integer> list = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i< a.length;i++){
            set.add(a[i]);
        }
        for(int i=0; i< b.length;i++){
            set.add(b[i]);
        }
        list.addAll(set);
        Collections.sort(list);
        return list;
    }
}
