// Last updated: 7/28/2026, 10:17:03 PM
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
12    public ListNode swapNodes(ListNode head, int k) {
13        ListNode dummy=new ListNode(0);
14        dummy.next=head;
15        ListNode fast=dummy;
16        ListNode slow=dummy;
17        for(int i=1;i<k;i++){
18            fast=fast.next;
19        }
20        ListNode temp=fast.next;
21        while(fast.next!=null){
22            slow=slow.next;
23            fast=fast.next;
24        }
25        int num=slow.val;
26        slow.val=temp.val;
27        temp.val=num;
28        return head;
29        
30    }
31}