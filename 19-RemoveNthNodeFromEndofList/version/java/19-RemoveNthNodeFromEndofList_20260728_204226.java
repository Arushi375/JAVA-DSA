// Last updated: 7/28/2026, 8:42:26 PM
/*
 * used two pointer approach 
 * LeetCode expects the optimal solution using fast and slow pointers.
 * 
 * Algorithm
 * Create a dummy node before head.
 * Move fast pointer n steps.
 * Move fast and slow together until fast.next == null.
 * slow.next is the node to delete.
 * Delete it.
 * Complexity
 * Time: O(N)
 * Space: O(1)
 * 
 * This requires only one traversal and does not reverse the list.
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
12    public ListNode removeNthFromEnd(ListNode head, int n) {
13        if(head==null){return null;}
14        if(head.next==null&&n==1){
15            return null;
16        }
17        ListNode fast=head;
18        ListNode slow=head;
19        for(int i=1;i<=n;i++){
20            fast=fast.next;
21        }
22        if (fast == null) {
23            return head.next;
24        }
25        while(fast.next!=null){
26            fast=fast.next;
27            slow=slow.next;;
28        }
29        slow.next=slow.next.next;
30        return head;
31    }
32}