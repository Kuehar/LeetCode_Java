// 最初に思いついた誤答。これだとhead.next.nextの箇所のnullを考慮できていないため誤り。

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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        while(n>0){
            head = head.next;
            n--;
        }
        head.next = head.next.next;
        return dummy.next;
    }
}
