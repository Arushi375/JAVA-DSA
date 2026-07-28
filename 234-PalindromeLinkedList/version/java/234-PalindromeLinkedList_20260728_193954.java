// Last updated: 7/28/2026, 7:39:54 PM
/*
 * ## Approach (Short Summary)
 * 
 * 1. Use two pointers:
 * 
 *    * `slow` moves **1 step**.
 *    * `fast` moves **2 steps**.
 *    * This helps find the **middle** of the linked list.
 * 
 * 2. If the list has an **odd number of nodes**, move `slow` one step ahead to skip the middle element (since it doesn't affect the palindrome check).
 * 
 * 3. Reverse the **second half** of the linked list.
 * 
 * 4. Compare the first half (starting from `head`) with the reversed second half node by node.
 * 
 *    * If any values differ, return `false`.
 *    * If all values match, return `true`.
 * 
 * ---
 * 
 * ## Why reverse the second half?
 * 
 * We reverse the **second half** because:
 * 
 * * It allows us to compare both halves in the **same forward direction**.
 * * It is easier to implement than reversing the first half.
 * * It handles both **even** and **odd** length lists cleanly (by simply skipping the middle node in odd-length lists).
 * * It requires only **O(1)** extra space since the reversal is done in-place.
 * 
 * **Example:**
 * 
 * ```
 * 1 → 2 → 3 → 2 → 1
 * ```
 * 
 * After finding the middle and reversing the second half:
 * 
 * ```
 * First half : 1 → 2
 * Second half: 1 → 2
 * ```
 * 
 * Now both halves can be compared directly.
 * 
 * ---
 * 
 * ## Complexity Analysis
 * 
 * * **Time Complexity:** **O(N)**
 * 
 *   * Finding the middle: **O(N/2)**
 *   * Reversing the second half: **O(N/2)**
 *   * Comparing both halves: **O(N/2)**
 *   * Total: **O(N)**
 * 
 * * **Space Complexity:** **O(1)**
 * 
 *   * Only a few pointers are used; no extra data structures are required.
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
12    public boolean isPalindrome(ListNode head) {
13        if(head.next==null){
14            return true;
15        }
16        ListNode fast=head;
17        ListNode slow=head;
18        while(fast!=null&&fast.next!=null&&slow!=null){
19            slow=slow.next;
20            fast=fast.next.next;
21        }
22        ListNode temp=slow;
23        ListNode prev=null;
24        ListNode next=null;
25        while(temp!=null){
26            next=temp.next;
27            temp.next=prev;
28            prev=temp;
29            temp=next;
30        }
31        temp=head;
32        while(prev!=null){
33            if(prev.val!=temp.val){
34                return false;
35            }
36            prev=prev.next;
37            temp=temp.next;
38        }
39        return true;
40    }
41}