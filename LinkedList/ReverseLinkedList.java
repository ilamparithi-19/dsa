
public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
    public ListNode reverseList(ListNode head) {
        // if(head == null || head.next == null) {
        //     return head;
        // }
        // ListNode prev = null;
        // ListNode curr = head;
        // ListNode next = null;
        // while (curr != null) {
        //     next = curr.next;
        //     curr.next = prev;
        //     prev = curr;
        //     curr = next;
        // }
        // head = prev;
        // return head;
        ListNode tempHead = head;
        ListNode curr = head;
        ListNode next = null;
        ListNode prev = null;
        return reverseUtil(curr, next, prev);
        // return tempHead; 
    }
    
    public ListNode reverseUtil(ListNode curr, ListNode next, ListNode prev) {
        if(curr == null) {
            return prev;
        }
        next = curr.next;
        curr.next = prev;
        prev = curr;
        curr = next;
        return reverseUtil(curr, next, prev);
        
    }
}