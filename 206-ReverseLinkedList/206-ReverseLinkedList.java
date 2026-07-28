// Last updated: 7/28/2026, 5:10:35 PM
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
    public ListNode reverseList(ListNode head) {
        ListNode temp=head;
        ListNode prev=null;
        ListNode rev=null;
        while(temp!=null){
            prev=temp.next;
            temp.next=rev;
            rev=temp;
            temp=prev;
        }
        return rev;
    }
}