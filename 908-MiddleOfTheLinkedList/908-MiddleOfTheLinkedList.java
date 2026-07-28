// Last updated: 7/28/2026, 5:09:44 PM
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
    public ListNode middleNode(ListNode head) {
        ListNode temp=head;
        ListNode result=head;
        while(temp!=null && temp.next!=null & result!=null){
            result=result.next;
            temp=temp.next.next;
        }
        return result;
    }
}