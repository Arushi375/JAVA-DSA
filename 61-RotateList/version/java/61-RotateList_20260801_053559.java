// Last updated: 8/1/2026, 5:35:59 AM
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
12    public ListNode rotateRight(ListNode head, int k) {
13        if(head==null||head.next==null||k==0){
14            return head;
15        }
16        ListNode curr=head;
17        ListNode prev=null;
18        ListNode newHead;
19        ListNode tail=head;;
20        int len=0;
21        while(tail.next!=null){
22            tail=tail.next;
23            len++;
24        }
25        len++;
26        k=k%len;
27        if(k==0){
28            return head;
29        }
30        k=len-k-1;
31        curr=head;
32        while(k>0){
33            curr=curr.next;
34            k--;
35        }
36        tail.next=head;
37        head=curr.next;
38        curr.next=null;
39        return head;
40    }
41}