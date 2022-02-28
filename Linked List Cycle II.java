/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        Set<ListNode> seen = new HashSet<>();
        while(head != null){
            if(seen.contains(head)){
                return head;
            }
            
            seen.add(head);
            head = head.next;
        }
        return null;
    }
}
// Runtime: 3 ms, faster than 24.83% of Java online submissions for Linked List Cycle II.
// Memory Usage: 43 MB, less than 34.40% of Java online submissions for Linked List Cycle II.
