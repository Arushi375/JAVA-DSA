// Last updated: 7/29/2026, 7:53:41 AM
// keep two pointers subtract the length make the pointers point to equal lengths then compare if temp1==temp2 then return temp1 else return null
1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode(int x) {
7 *         val = x;
8 *         next = null;
9 *     }
10 * }
11 */
12public class Solution {
13    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
14        ListNode temp1=headA;
15        ListNode temp2=headB;
16        int i=0,j=0,k=0;
17        int m=0;
18        int n=0;
19        while(temp1!=null){
20            temp1=temp1.next;
21            m++;
22        }
23        while(temp2!=null){
24            temp2=temp2.next;
25            n++;
26        }
27        k=Math.abs(m-n);
28        temp1=headA;
29        temp2=headB;
30        if(m>n){
31            while(k!=0){
32                temp1=temp1.next;
33                k--;
34            }
35        }
36        else{
37            while(k!=0){
38                temp2=temp2.next;
39                k--;
40            }
41        }
42        while(temp1!=null&&temp2!=null){
43            if(temp1==temp2){
44                return temp1;
45            }
46            temp1=temp1.next;
47            temp2=temp2.next;
48        }
49        return null;
50    }
51}