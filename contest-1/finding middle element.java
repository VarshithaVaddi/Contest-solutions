
class Solution {
    int getMiddle(Node head) {
        if (head == null) {
            return -1; // or throw an exception, depending on the requirements
        }
        
        Node slowPointer = head;
        Node fastPointer = head;
        
        while (fastPointer != null && fastPointer.next != null) {
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;
        }
        
        if (slowPointer != null) {
            return slowPointer.data;
        } else {
            return -1; // or handle this case as required
        }
    }
}
