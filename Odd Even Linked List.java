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
    public ListNode oddEvenList(ListNode head) {
        if(head == null) return null;
        // 最初のノードは必ず奇数、二つ目のノードが必ず偶数であるため、それぞれの場合を分ける。
        ListNode odd = head, even = head.next,evenHead = even;
        while(even != null && even.next != null){
            odd.next = even.next;
            odd = odd.next;
            even.next = odd.next;
            even = even.next;
        }
        odd.next = evenHead;
        return head;
    }
}
// Runtime: 0 ms, faster than 100.00% of Java online submissions for Odd Even Linked List.
// Memory Usage: 41.3 MB, less than 88.11% of Java online submissions for Odd Even Linked List.
