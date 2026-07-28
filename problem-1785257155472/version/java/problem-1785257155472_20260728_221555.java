// Last updated: 7/28/2026, 10:15:55 PM
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
20        while(fast.next!=null){
21            slow=slow.next;
22            fast=fast.next;
23        }
24        ListNode temp=head;
25        for(int i=1;i<k;i++){
26            temp=temp.next;
27        }
28        int num=slow.val;
29        slow.val=temp.val;
30        temp.val=num;
31        return head;
32        
33    }
34}