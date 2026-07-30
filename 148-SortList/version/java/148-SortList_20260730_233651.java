// Last updated: 7/30/2026, 11:36:51 PM
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
12    public ListNode sortList(ListNode head) {
13        if (head == null || head.next == null)
14            return head;
15        ListNode slow=head;
16        ListNode fast=head;
17        ListNode prev=null;
18        while(fast!=null&&fast.next!=null){
19            prev=slow;
20            slow=slow.next;
21            fast=fast.next.next;
22        }
23        prev.next=null;
24        ListNode mid=slow;
25
26        ListNode left=sortList(head);
27        ListNode right=sortList(slow);
28
29        return merge(left,right);
30
31    }
32    private ListNode merge(ListNode l1,ListNode l2){
33        ListNode list=new ListNode(0);
34        ListNode p=list;
35
36        while(l1!=null&& l2!=null){
37            if(l1.val<l2.val){
38                p.next=l1;
39                l1=l1.next;
40            }
41            else{
42                p.next=l2;
43                l2=l2.next;
44            }
45            p=p.next;
46        }
47        if(l1!=null){
48            p.next=l1;
49        }
50        if(l2!=null){
51            p.next=l2;
52        }
53
54        return list.next;
55    }
56}