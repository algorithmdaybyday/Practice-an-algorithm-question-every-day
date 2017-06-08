/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 *    p q r s  -> q p r s -> q p sr
 */
 
 
public class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode p = head;
        ListNode prev = dummy;
        while(p!=null && p.next!=null){
            ListNode q = p.next, r = p.next.next;
            prev.next = q;
            q.next = p;
            p.next = r;
            prev = p;
            p = r;
        }
        return dummy.next;
    }
}
