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
    public ListNode swapPairs(ListNode head) {
        // if the list has no node or has only one node left. 
        if(head == null || head.next == null) return head;
        
        // nodes to be swapped
        ListNode firstNode = head;
        ListNode secondNode = head.next;
        
        // swap
        firstNode.next = swapPairs(secondNode.next);
        secondNode.next = firstNode;
        
        return secondNode;
    }
}
// Runtime: 0 ms, faster than 100.00% of Java online submissions for Swap Nodes in Pairs.
// Memory Usage: 42.1 MB, less than 24.63% of Java online submissions for Swap Nodes in Pairs.
