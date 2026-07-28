// Last updated: 7/28/2026, 8:25:34 PM
/*
 * simplest approach reverse it then traverse to n-1 then delete then reverse back
 * 
 * but also do using two pointer apporach
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
12    public ListNode reverse(ListNode head){
13        ListNode temp=head;
14        ListNode prev=null;
15        ListNode next=null;
16        while(temp!=null){
17            next=temp.next;
18            temp.next=prev;
19            prev=temp;
20            temp=next;
21        }
22        return prev;
23    }
24    public ListNode removeNthFromEnd(ListNode head, int n) {
25        if(head==null){
26            return null;
27        }
28        if(head.next==null&&n==1){
29            return null;
30        }
31        ListNode newHead=reverse(head);
32        ListNode temp=newHead;
33        if (n == 1) {
34            newHead = newHead.next;
35            return reverse(newHead);
36        }
37        for(int i=1;i<n-1;i++){
38            temp=temp.next;
39        }
40        temp.next=temp.next.next;
41        ListNode brandNewHead=reverse(newHead);
42        return brandNewHead;
43    }
44}