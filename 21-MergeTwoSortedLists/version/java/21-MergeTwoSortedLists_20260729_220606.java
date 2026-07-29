// Last updated: 7/29/2026, 10:06:06 PM
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
12    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
13        ListNode temp1=list1;
14        ListNode temp2=list2;
15        ListNode newHead=new ListNode(0);
16        ListNode head=newHead;
17        while(temp1!=null&&temp2!=null){
18            if(temp1.val<=temp2.val){
19                newHead.next=temp1;
20                temp1=temp1.next;
21            }
22            else{
23                newHead.next=temp2;
24                temp2=temp2.next;
25            }
26            newHead=newHead.next;
27        }
28        if(temp1==null){
29            newHead.next=temp2;
30        }
31        else{
32            newHead.next=temp1;
33        }
34        
35        return head.next;
36    }
37}