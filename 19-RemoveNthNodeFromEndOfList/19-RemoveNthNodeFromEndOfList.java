// Last updated: 7/28/2026, 10:40:05 PM
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
        if(head==null){return null;}
        if(head.next==null&&n==1){
            return null;
        }
        ListNode fast=head;
        ListNode slow=head;
        for(int i=1;i<=n;i++){
            fast=fast.next;
        }
        if (fast == null) {
            return head.next;
        }
        while(fast.next!=null){
            fast=fast.next;
            slow=slow.next;;
        }
        slow.next=slow.next.next;
        return head;
    }
}