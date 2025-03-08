/*class Node {
    int data;
    Node next;
    Node(int value) {
        this.value = value;
    }
}

*/

class Solution {
    Node reverseList(Node head) {
        Node temp = head;
        Node prev = null;
        
        while(temp != null){ 
        Node front = temp.next;
        temp.next = prev;
        prev = temp;
        temp = front;
        }
        return prev ;
    }
}
