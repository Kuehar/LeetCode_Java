/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Set<ListNode> hash = new HashSet<>();
        while(headA != null){
            hash.add(headA);
            headA = headA.next;
        }
        
        while(headB != null){
         if(hash.contains(headB)) return headB;
            headB = headB.next;
        }
        return null;
    }
}
// Runtime: 5 ms, faster than 29.48% of Java online submissions for Intersection of Two Linked Lists.
// Memory Usage: 44.6 MB, less than 89.49% of Java online submissions for Intersection of Two Linked Lists.
