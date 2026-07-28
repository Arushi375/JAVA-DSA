// Last updated: 7/28/2026, 10:38:46 PM
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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode fast=dummy;
        ListNode slow=dummy;
        for(int i=1;i<k;i++){
            fast=fast.next;
        }
        ListNode temp=fast.next;
        while(fast.next!=null){
            slow=slow.next;
            fast=fast.next;
        }
        int num=slow.val;
        slow.val=temp.val;
        temp.val=num;
        return head;
        
    }
}