// Last updated: 7/30/2026, 12:13:06 AM
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
16        ListNode curr=head;
17        while(curr.next!=null){
18            if(curr.val==curr.next.val){
19                curr.next=curr.next.next;
20                continue;
21            }
22            curr=curr.next;
23        }
24        return head;
25    }
26}