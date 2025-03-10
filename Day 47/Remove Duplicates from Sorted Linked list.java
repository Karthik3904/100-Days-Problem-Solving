/*
class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
*/

class Solution {
    // Function to remove duplicates from sorted linked list.
    Node removeDuplicates(Node head) {
        if(head == null || head.next == null) return head;
        
        Node temp = head;
        Node prev = temp;
        boolean found = false;
        while(temp != null && temp.next != null)
        {
            Node after= temp.next;
            while(temp.data == after.data && after.next != null)
            {
                after = after.next;
            found = true;
            }
            
            temp.next = after;
            prev = temp;
            temp = after;
            
            
        }
        //System.out.println("TEMP" +  temp.data + " .. "+"PREV" + prev.data);
        if(found && temp.data == prev.data)
            prev.next = null;
        return head;
    }
}
