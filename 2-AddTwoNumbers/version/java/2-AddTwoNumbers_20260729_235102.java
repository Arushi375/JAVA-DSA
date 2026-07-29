// Last updated: 7/29/2026, 11:51:02 PM
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
12    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
13        ListNode dummyNode=new ListNode(-1);
14        ListNode curr=dummyNode;
15        ListNode t1=l1;
16        ListNode t2=l2;
17        int carry=0;
18        while(t1!=null||t2!=null){
19            int sum=carry;
20            if(t1!=null){
21                sum=sum+t1.val;
22            }
23            if(t2!=null){
24                sum=sum+t2.val;
25            }
26            ListNode newNode = new ListNode(sum%10);
27            carry=sum/10;
28            curr.next=newNode;
29            curr=curr.next;
30            if(t1!=null){
31                t1=t1.next;
32            }
33            if(t2!=null){
34                t2=t2.next;
35            }
36            if(carry>0){
37                ListNode newnode=new ListNode(carry);
38                curr.next=newnode;
39            }
40        }
41        return dummyNode.next;
42    }
43}