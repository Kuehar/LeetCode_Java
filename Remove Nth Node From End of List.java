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

// リストの先頭から (L - n + 1)(L-n+1) 個目のノードを削除するという思想のもと連結リストの長さをlengthとして取り、その後nを差し引く。
// その後合致した箇所でnextをnext.nextに付け替えれば完了
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        int length = 0;
        while(head != null){
            length++;
            head = head.next;
        }
        length -= n;
        head = dummy;
    
        while(length>0){
            length--;
            head = head.next;
        }
        head.next = head.next.next;
        return dummy.next;
    }
}
// Runtime: 0 ms, faster than 100.00% of Java online submissions for Remove Nth Node From End of List.
// Memory Usage: 43.3 MB, less than 5.34% of Java online submissions for Remove Nth Node From End of List.
 
