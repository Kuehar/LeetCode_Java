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
    public boolean isPalindrome(ListNode head) {
        Deque<Integer> deque = new ArrayDeque<>();
        ListNode node = head;
        while(head != null){
            deque.push(head.val);
            head = head.next;
        }
        
        while(node != null){
            if(node.val != deque.pop()){
                return false;
            }
            node = node.next;
        }
        return true;
    }
}
// Runtime: 24 ms, faster than 20.37% of Java online submissions for Palindrome Linked List.
// Memory Usage: 105.4 MB, less than 37.52% of Java online submissions for Palindrome Linked List.
