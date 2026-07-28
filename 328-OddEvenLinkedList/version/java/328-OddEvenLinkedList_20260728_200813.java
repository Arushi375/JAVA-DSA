// Last updated: 7/28/2026, 8:08:13 PM
/*
 * ## Intuition
 * 
 * The problem asks us to group all **odd-indexed nodes** first, followed by all **even-indexed nodes**, while maintaining their original relative order.
 * 
 * Instead of creating two new linked lists, we can **rearrange the existing pointers**.
 * 
 * We maintain:
 * 
 * * An **odd pointer** that links all odd-indexed nodes.
 * * An **even pointer** that links all even-indexed nodes.
 * * Store the head of the even list (`evenHead`) so that after processing, we can attach it to the end of the odd list.
 * 
 * This rearranges the list **in-place** using constant extra space.
 * 
 * ---
 * 
 * ## Approach
 * 
 * 1. If the list is empty or has only one node, return the head.
 * 
 * 2. Initialize:
 * 
 *    * `odd = head`
 *    * `even = head.next`
 *    * `evenHead = even` (to remember the start of the even list)
 * 
 * 3. Traverse while both `even` and `even.next` exist:
 * 
 *    * Connect the current odd node to the next odd node:
 * 
 *      ```java
 *      odd.next = even.next;
 *      odd = odd.next;
 *      ```
 *    * Connect the current even node to the next even node:
 * 
 *      ```java
 *      even.next = odd.next;
 *      even = even.next;
 *      ```
 * 
 * 4. After traversal, the odd list ends at `odd`.
 *    Connect it to the head of the even list:
 * 
 *    ```java
 *    odd.next = evenHead;
 *    ```
 * 
 * 5. Return `head`.
 * 
 * ---
 * 
 * ## Dry Run
 * 
 * Input:
 * 
 * ```text
 * 1 → 2 → 3 → 4 → 5
 * ```
 * 
 * Initially:
 * 
 * ```text
 * Odd : 1
 * Even: 2
 * evenHead = 2
 * ```
 * 
 * ### Iteration 1
 * 
 * ```text
 * odd.next = 3
 * even.next = 4
 * ```
 * 
 * List becomes:
 * 
 * ```text
 * Odd : 1 → 3
 * Even: 2 → 4
 * Remaining: 5
 * ```
 * 
 * ### Iteration 2
 * 
 * ```text
 * odd.next = 5
 * even.next = null
 * ```
 * 
 * Now:
 * 
 * ```text
 * Odd : 1 → 3 → 5
 * Even: 2 → 4
 * ```
 * 
 * Finally,
 * 
 * ```text
 * odd.next = evenHead
 * ```
 * 
 * Result:
 * 
 * ```text
 * 1 → 3 → 5 → 2 → 4
 * ```
 * 
 * ---
 * 
 * ## Why does this work?
 * 
 * At every step:
 * 
 * * The `odd` pointer skips one node to connect to the next odd-indexed node.
 * * The `even` pointer skips one node to connect to the next even-indexed node.
 * 
 * Thus, both odd and even nodes preserve their original order. Since we saved the head of the even list, we can attach it after the odd list at the end.
 * 
 * ---
 * 
 * ## Complexity Analysis
 * 
 * * **Time Complexity:** **O(N)**
 *   Each node is visited once.
 * 
 * * **Space Complexity:** **O(1)**
 *   Only a few pointers are used; no extra linked list or array is created.
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
12    public ListNode oddEvenList(ListNode head) {
13        if(head==null||head.next==null){
14            return head;
15        }
16        int num=2;
17        ListNode odd=head;
18        ListNode even=head.next;
19        ListNode evenHead=even;
20        while(odd.next!=null&&even.next!=null)
21        {
22            odd.next=even.next;
23            odd=odd.next;
24            even.next=odd.next;
25            even=even.next;
26        }
27        odd.next=evenHead;
28        return head;
29
30    }
31}