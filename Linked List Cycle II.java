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
    
    private ListNode getIntersect(ListNode head){
        ListNode tortoise = head;
        ListNode hare = head;
        
        while(hare != null && hare.next != null){
            tortoise = tortoise.next;
            hare = hare.next.next;
            if(tortoise == hare){
                return tortoise;
            }
        }
        return null;
    }
    
    public ListNode detectCycle(ListNode head) {
        if(head == null) return null;
        
        ListNode intersect = getIntersect(head);
        if(intersect == null) return null;
        
        
        ListNode ptr1 = head;
        ListNode ptr2 = intersect;
        while(ptr1 != ptr2){
            ptr1 = ptr1.next;
            ptr2 = ptr2.next;
        }
        return ptr1;
    }
}
// Runtime: 0 ms, faster than 100.00% of Java online submissions for Linked List Cycle II.
// Memory Usage: 42.6 MB, less than 39.35% of Java online submissions for Linked List Cycle II.
