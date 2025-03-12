class GfG {
    public Stack<Integer> sort(Stack<Integer> s) {
        if(!s.isEmpty()){
            int temp=s.pop();
            sort(s);
            insert(s,temp);
        }
        return s;
    }
    private void insert(Stack<Integer> s,int temp){
            if(s.isEmpty() || s.peek()<=temp){
                s.push(temp);
                return;
            }
            int top=s.pop();
            insert(s,temp);
            s.push(top);
        }
            
        
    
}
