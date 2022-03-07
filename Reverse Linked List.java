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
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while(curr != null){
            // currの次のノードを保管するためのtempを作成し、保存する
            ListNode temp = curr.next;
            // curr.nextをprev(自分の参照元)に付け替える
            curr.next = prev;
            // prevの値をcurrに更新する
            prev = curr;
            // currを最初に保存しておいたtemp(中身はcurr.next)に代入する。この行と一つ上の処理でcurr,prevが一つずつ次にずれる
            curr = temp;
        }
        return prev;
    }
}
// Runtime: 0 ms, faster than 100.00% of Java online submissions for Reverse Linked List.
// Memory Usage: 38.5 MB, less than 89.03% of Java online submissions for Reverse Linked List.

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
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode p = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return p;
    }
}
// Runtime: 0 ms, faster than 100.00% of Java online submissions for Reverse Linked List.
// Memory Usage: 43.2 MB, less than 17.59% of Java online submissions for Reverse Linked List.
