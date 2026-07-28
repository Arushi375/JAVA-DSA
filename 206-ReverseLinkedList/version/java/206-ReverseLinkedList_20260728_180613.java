// Last updated: 7/28/2026, 6:06:13 PM
/*
 * recursive approach: 
 * break the problem into smaller and smaller parts
 * solve it for the smallest first 
 * here smallest => only one node => return the head itself
 * 
 * next smallest 2 nodes : 
 * eg: 2->5->null
 * for this 
 * 2.next=5.next i.e null
 * 
 * 
 * 5.next=2
 * which gives 5->2-> null
 * 
 * return 5 i.e. the new head
 * The recursive approach (14:40 - 26:55) reverses the linked list by breaking it into sub-problems:
 * 
 * Base Case: If the list is empty or has one node, return the head .
 * Recursive Call: Recursively call the function for head.next to reach the end of the list .
 * Pointer Reversal: As the recursion unwinds, point the next node back to the current head (head.next.next = head) and set the current head.next to null 
 * Result: The new head is passed back up the call stack until the entire list is reversed.
 * 
 * 
 * time complexity : O(n)
 * space complexity:O(n) {due to recursive stack space}
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
12    public ListNode reverseList(ListNode head) {
13        if(head==null||head.next==null){
14            return head;
15        }
16        ListNode newHead=reverseList(head.next);
17        ListNode front=head.next;
18        front.next=head;
19        head.next=null;
20        return newHead;
21    }
22}