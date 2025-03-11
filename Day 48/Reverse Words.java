class Solution {
    // Function to reverse words in a given string
    public String reverseWords(String s) {
        String[] str=s.trim().split("\\s+");
        StringBuilder st=new StringBuilder();
        for(int i=str.length-1;i>0;i--){
            st.append(str[i]);
            st.append(" ");
        }
        st.append(str[0]);
        return st.toString();
    }
}
