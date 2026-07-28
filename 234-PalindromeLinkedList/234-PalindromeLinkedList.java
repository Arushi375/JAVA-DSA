// Last updated: 7/28/2026, 10:39:05 PM
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
    public boolean isPalindrome(ListNode head) {
        if(head.next==null){
            return true;
        }
        ListNode fast=head;
        ListNode slow=head;
        while(fast!=null&&fast.next!=null&&slow!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode temp=slow;
        ListNode prev=null;
        ListNode next=null;
        while(temp!=null){
            next=temp.next;
            temp.next=prev;
            prev=temp;
            temp=next;
        }
        temp=head;
        while(prev!=null){
            if(prev.val!=temp.val){
                return false;
            }
            prev=prev.next;
            temp=temp.next;
        }
        return true;
    }
}