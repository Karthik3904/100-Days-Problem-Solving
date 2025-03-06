class Solution {
    // Function to find the next greater element for each element of the array.
    public ArrayList<Integer> nextLargerElement(int[] arr) {
        int n=arr.length;
        ArrayList<Integer> res=new ArrayList<>(Collections.nCopies(n,-1));
        Stack<Integer> stack=new Stack<>();
        for(int i=n-1;i>=0;i--)
        {
            while(!stack.isEmpty() && stack.peek()<=arr[i])
            {
             stack.pop();   
            }
            if(!stack.isEmpty())
            {
                res.set(i,stack.peek());
            }
            stack.push(arr[i]);
        }
        return res;
    }
}
