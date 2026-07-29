// Last updated: 7/29/2026, 11:57:43 PM
/*
 * Approach Summary (Human-friendly)
 * Create a dummy node to simplify building the answer list.
 * Use two pointers (t1 and t2) to traverse both linked lists simultaneously.
 * Maintain a carry variable, initialized to 0.
 * While either list still has nodes:
 * Start the sum with the current carry.
 * Add the value from t1 if it exists.
 * Add the value from t2 if it exists.
 * Create a new node with sum % 10 (the current digit).
 * Update carry = sum / 10 for the next iteration.
 * Move the pointers (t1, t2, and curr) forward.
 * After processing all digits, if a carry remains, append one final node containing the carry.
 * Return dummyNode.next as the head of the resulting linked list.
 * 
 * Time Complexity: O(max(n, m))
 * Space Complexity: O(max(n, m))
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
36        }
37        if(carry>0){
38                ListNode newnode=new ListNode(carry);
39                curr.next=newnode;
40            }
41        return dummyNode.next;
42    }
43}