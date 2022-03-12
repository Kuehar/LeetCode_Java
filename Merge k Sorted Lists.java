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
// 一度全てのノードの値を配列に追加し、ソートする。ソートされたリストの値を引数にしてノードを生成、ポインタを繋げていくやり方。
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        List<Integer> arrList = new ArrayList<Integer>();
        
        for(ListNode l:lists){
            while(l != null){
                arrList.add(l.val);
                l = l.next;
            }
        }
        
        Collections.sort(arrList);
        
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        for(int i: arrList){
            ListNode t = new ListNode(i);
            current.next = t;
            current = current.next;
        }
        current.next = null;
        return dummy.next;
    }
}
// Runtime: 10 ms, faster than 37.80% of Java online submissions for Merge k Sorted Lists. O(NlogN).
// Memory Usage: 48.7 MB, less than 5.48% of Java online submissions for Merge k Sorted Lists.

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
// 値を比較する解法
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        int min_index = 0;
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        while(true){
            boolean isBreak = true;
            int min = Integer.MAX_VALUE;
            for(int i=0;i<lists.length;i++){
                if(lists[i] != null){
                    if(lists[i].val < min){
                        min_index = i;
                        min = lists[i].val;
                    }
                    isBreak = false;
                }
            }
            if(isBreak){
                break;
            }
            ListNode a = new ListNode(lists[min_index].val);
            current.next = a;
            current = current.next;
            lists[min_index] = lists[min_index].next;
        }
        current.next = null;
        return dummy.next;
    }
}
// Runtime: 413 ms, faster than 5.03% of Java online submissions for Merge k Sorted Lists. O(n)
// Memory Usage: 48.2 MB, less than 9.49% of Java online submissions for Merge k Sorted Lists.
