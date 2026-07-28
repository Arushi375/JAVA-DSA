// Last updated: 7/28/2026, 6:56:11 PM
/*
 * # Floyd's Cycle Detection Algorithm (Tortoise and Hare)
 * 
 * ## Why use this algorithm?
 * 
 * The previous approach for detecting a loop uses **O(N) extra memory** (e.g., storing visited nodes), which becomes inefficient for large linked lists.
 * 
 * The **Tortoise and Hare Algorithm** improves this by:
 * 
 * * **Time Complexity:** O(N)
 * * **Space Complexity:** O(1) (constant extra space)
 * 
 * ---
 * 
 * # Algorithm
 * 
 * ### Step 1: Initialize two pointers
 * 
 * * `slow` → points to the head.
 * * `fast` → also points to the head.
 * 
 * Movement:
 * 
 * * `slow` moves **1 step** at a time.
 * * `fast` moves **2 steps** at a time.
 * 
 * ---
 * 
 * ### Step 2: Traverse the linked list
 * 
 * Move both pointers simultaneously until one of the following happens:
 * 
 * ### Case 1: No loop exists
 * 
 * If either
 * 
 * * `fast == null`, or
 * * `fast.next == null`
 * 
 * then the linked list has **no cycle**.
 * 
 * Return `null`.
 * 
 * ---
 * 
 * ### Case 2: Loop exists
 * 
 * If
 * 
 * ```
 * slow == fast
 * ```
 * 
 * both pointers meet at some node.
 * 
 * This confirms that a **cycle is present**.
 * 
 * ---
 * 
 * ### Step 3: Find the starting node of the loop
 * 
 * Once the pointers meet:
 * 
 * 1. Reset `slow` to the **head**.
 * 2. Keep `fast` at the meeting point.
 * 3. Move both pointers **one step at a time**.
 * 
 * The node where they meet again is the **starting node of the loop**.
 * 
 * ---
 * 
 * # Why does this work? (Proof)
 * 
 * ## Step 1: Distance travelled before entering the loop
 * 
 * Suppose the **starting point of the loop** is at a distance **L₁** from the head.
 * 
 * When the **slow pointer** reaches the beginning of the loop:
 * 
 * * Slow has travelled **L₁** nodes.
 * * Fast has travelled **2 × L₁** nodes because it moves twice as fast.
 * 
 * ---
 * 
 * ## Step 2: Define the remaining distance
 * 
 * Let
 * 
 * * **d** = remaining distance in the loop after the slow pointer enters it.
 * 
 * Then,
 * 
 * ```
 * Total length of loop = L₁ + d
 * ```
 * 
 * ---
 * 
 * ## Step 3: Why do they meet?
 * 
 * Inside the loop:
 * 
 * * Fast moves **2 nodes** per step.
 * * Slow moves **1 node** per step.
 * 
 * Therefore,
 * 
 * * The gap between them decreases by **1 node per step**.
 * 
 * Since the initial gap is **d**, they meet after exactly **d steps**.
 * 
 * ---
 * 
 * ## Step 4: Distance travelled until meeting
 * 
 * After these **d steps**:
 * 
 * ### Slow pointer travels
 * 
 * ```
 * Distance = L₁ + d
 * ```
 * 
 * ### Fast pointer travels
 * 
 * ```
 * Distance = 2(L₁ + d)
 * ```
 * 
 * Since
 * 
 * ```
 * Loop length = L₁ + d
 * ```
 * 
 * the slow pointer has completed exactly one full loop by the time they meet.
 * 
 * ---
 * 
 * ## Step 5: Key observation
 * 
 * The meeting point divides the loop into two parts:
 * 
 * * Distance from **loop start → meeting point = d**
 * * Remaining distance from **meeting point → loop start = L₁**
 * 
 * Thus,
 * 
 * ```
 * Distance(head → loop start)
 * =
 * Distance(meeting point → loop start)
 * ```
 * 
 * Both distances are **L₁**.
 * 
 * ---
 * 
 * ## Step 6: Why resetting `slow` works
 * 
 * After the first meeting:
 * 
 * * Reset `slow` to the **head**.
 * * Keep `fast` at the **meeting point**.
 * 
 * Now move both pointers **one step at a time**.
 * 
 * * `slow` needs **L₁** steps to reach the loop start.
 * * `fast` also needs **L₁** steps (remaining distance inside the loop).
 * 
 * Hence, they meet exactly at the **starting node of the loop**.
 * 
 * ---
 * 
 * # Complexity Analysis
 * 
 * | Operation          | Complexity |
 * | ------------------ | ---------- |
 * | Detect cycle       | O(N)       |
 * | Find starting node | O(N)       |
 * | Total Time         | **O(N)**   |
 * | Extra Space        | **O(1)**   |
 * 
 * ---
 * 
 * # Final Summary
 * 
 * * Use two pointers:
 * 
 *   * **Slow:** moves 1 step.
 *   * **Fast:** moves 2 steps.
 * * If `fast` or `fast.next` becomes `null`, **no loop exists**.
 * * If `slow == fast`, a **loop exists**.
 * * Reset `slow` to the head.
 * * Move both pointers one step at a time.
 * * The node where they meet again is the **starting point of the loop**.
 * * This works because the **distance from the head to the loop start equals the distance from the first meeting point to the loop start**, allowing both pointers to arrive there simultaneously.
*/

1/**
2 * Definition for singly-linked list.
3 * class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode(int x) {
7 *         val = x;
8 *         next = null;
9 *     }
10 * }
11 */
12public class Solution {
13    public ListNode detectCycle(ListNode head) {
14        if(head==null||head.next==null){
15            return null;
16        }
17        ListNode slow=head;
18        ListNode fast=head;
19        while (slow!=null && fast!=null&& fast.next!=null){
20            slow=slow.next;
21            fast=fast.next.next;
22            if(slow==fast){
23                slow=head;
24                while(slow!=fast){
25                    slow=slow.next;
26                    fast=fast.next;
27                }
28                return slow;
29            }
30        }
31        
32        return null;
33    }
34}