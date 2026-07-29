// Last updated: 7/30/2026, 12:39:33 AM
/*
 * Approach Summary
 * Create a dummy node pointing to the head to handle cases where the first few nodes are duplicates.
 * Initialize two pointers:
 * prev → points to the last confirmed unique node.
 * curr → traverses the list.
 * Traverse the list once:
 * If curr and curr.next have the same value:
 * Store the duplicate value.
 * Skip all nodes having that value using curr.
 * Connect prev.next to the first node with a different value (or null if none).
 * Otherwise:
 * The current node is unique, so move both prev and curr one step forward.
 * Return dummy.next as the head of the modified list.
 * Key Idea
 * curr is responsible for finding and skipping duplicate groups.
 * prev always points to the last unique node, allowing us to reconnect the list after duplicates are removed.
 * Using a dummy node ensures duplicate nodes at the beginning of the list are handled without any special cases.
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(1)
*/

1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
9 * }
10 */
11class Solution {
12    public ListNode deleteDuplicates(ListNode head) {
13        if(head==null||head.next==null){
14            return head;
15        }
16        ListNode dummy=new ListNode(-1);
17        dummy.next=head;
18        ListNode curr=head;
19        ListNode prev=dummy;
20        while(curr!=null){
21            if(curr.next!=null&&curr.val==curr.next.val){
22                int dup=curr.val;
23                while (curr != null && curr.val == dup) {
24                    curr = curr.next;
25                }
26
27                prev.next = curr;
28            } else {
29                prev = curr;
30                curr = curr.next;
31            }
32        }
33        return dummy.next;
34    }
35}