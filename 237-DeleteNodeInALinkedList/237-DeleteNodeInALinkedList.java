// Last updated: 7/28/2026, 5:10:24 PM
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        ListNode nextNode=node.next;
        node.val=nextNode.val;
        node.next=nextNode.next;
        
    }
}