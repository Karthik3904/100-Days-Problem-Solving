class Solution {
    // Function to delete middle element of a stack.
    public void deleteMid(Stack<Integer> s) {
            Stack<Integer> temp=new Stack<>();
            int n=s.size();
            for(int i=0;i<n/2;i++){
                temp.push(s.pop());
            }
            s.pop();
            while(!temp.isEmpty()){
                s.push(temp.pop());
            }
    }
}
