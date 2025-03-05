/*class Node{
    int data;
    Node next;
    Node(int a){  data = a; next = null; }
}*/

class Solution {
    // Function to count nodes of a linked list.
    public int getCount(Node head) {
         int count=1;
         Node temp=head;
           while(temp.next!=null){
                temp=temp.next;
                count=count+1;
            }
            return count;
    }
}
