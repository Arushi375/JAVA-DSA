// Last updated: 7/28/2026, 5:09:04 PM
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
    public ListNode deleteMiddle(ListNode head) {
        if (head == null || head.next == null) {
            return null;
        }
        ListNode temp=head;
        ListNode result=head;
        ListNode prev=result;
        while(temp!=null && temp.next!=null && result!=null){
            prev=result;
            result=result.next;
            temp=temp.next.next;
        }
        prev.next=result.next;
        return head;
    }
}