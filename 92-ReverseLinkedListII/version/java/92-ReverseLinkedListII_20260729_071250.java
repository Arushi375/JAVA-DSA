// Last updated: 7/29/2026, 7:12:50 AM
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
12    public ListNode reverseBetween(ListNode head, int left, int right) {
13        if(head==null||head.next==null||left==right){
14            return head;
15        }
16        ListNode dummy=new ListNode(0);
17        dummy.next=head;
18        ListNode leftNode=dummy;
19        ListNode rightNode=dummy;
20        for(int i=1;i<left;i++){
21            leftNode=leftNode.next;
22        }
23        for(int i=1;i<=right;i++){
24            rightNode=rightNode.next;
25        }
26        ListNode end=rightNode.next;
27        ListNode start=leftNode.next;
28        ListNode temp=leftNode.next;
29        ListNode prev=null;
30        ListNode next=null;
31        while(temp!=end){
32            next=temp.next;
33            temp.next=prev;
34            prev=temp;
35            temp=next;
36        }
37
38        leftNode.next=rightNode;
39        start.next=end;
40        return dummy.next;
41    }
42}