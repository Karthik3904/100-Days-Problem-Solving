class Solution {
    static boolean isBalanced(String s) {
        Stack<Character> stack=new Stack<Character>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(' || s.charAt(i)=='[' || s.charAt(i)=='{') stack.push(s.charAt(i));
            else{
                if(stack.isEmpty()) return false;
                char ch = stack.peek();
                if(s.charAt(i) == ')' && ch == '(' ||s.charAt(i) == ']' && ch == '['||s.charAt(i) == '}' && ch == '{'){
                    stack.pop();
                }else{
                    return false;
                }
            }
        }
              
        
        if(!stack.isEmpty()) return false;
        return true;
      
    }
}
