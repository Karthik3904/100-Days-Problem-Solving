/* The structure of linked list is the following
class Node
{
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}
*/

class Solution {
    // Function to remove duplicates from unsorted linked list.
    public Node removeDuplicates(Node head) {
        HashSet<Integer> set = new HashSet<>();
        Node res = new Node(-1);
        Node curr = res;
        Node temp = head;
        while(temp != null)
        {
            if(!set.contains(temp.data))
            {
                set.add(temp.data);
                
                Node add = new Node(temp.data);
                //System.out.println("Add "+ add.data);
                curr.next = add;
                curr = curr.next;
            }
            temp = temp.next;
        }
        return res.next;
    }
}
