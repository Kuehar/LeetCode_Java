/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;
        ListNode pointer = head;
        while(pointer != null){
            if(pointer.val == val){
                prev.next = pointer.next;
            }else{
                prev = pointer; 
            }
            pointer = pointer.next;
        }
        return dummy.next;
    }
}
// Runtime: 1 ms, faster than 90.01% of Java online submissions for Remove Linked List Elements.
// Memory Usage: 49.1 MB, less than 33.27% of Java online submissions for Remove Linked List Elements.
