/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length==0) return null;
        int end = lists.length - 1;
        while(end > 0) {
            int begin = 0;
            while(begin < end) {
                lists[begin]= merge2Lists(lists[begin], lists[end]);
                begin++;
                end--;
            }
        }
        return lists[0];
    }
    
    private ListNode merge2Lists(ListNode l1, ListNode l2){
        ListNode dummyHead = new ListNode(0);
        ListNode p = dummyHead;
        while(l1 != null && l2 !=null){
            if(l1.val<l2.val){
                p.next = l1;
                l1 = l1.next;
            }else{
                p.next = l2;
                l2 = l2.next;
            }
                        p = p.next;

        }
            if(l1!=null) p.next = l1;
            if(l2!=null) p.next = l2;
            return dummyHead.next;
    }
}
