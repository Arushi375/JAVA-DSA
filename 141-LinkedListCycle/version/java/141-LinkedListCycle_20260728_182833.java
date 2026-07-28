// Last updated: 7/28/2026, 6:28:33 PM
/*
 * we use the Tortoise and Hare Algorithm (Floyd’s Cycle Detection). If the list contains a loop, both pointers will eventually enter the cycle. Since the hare is faster, it covers more distance and will eventually overtake the tortoise inside the loop, leading to a meeting point. On the other hand, if the list has no loop, the hare will simply reach the end, and the algorithm terminates without any meeting.
 * 
 * To detect a cycle using the Tortoise and Hare method, we start by initializing two pointers, slow and fast, at the head of the linked list.
 * The slow pointer moves forward one step at a time, while the fast pointer advances two steps at a time.
 * If the fast pointer or its next becomes null, it means the end of the linked list has been reached. In this case, there is no loop, and the list is linear.
 * If the slow and fast pointers eventually meet at the same node, it confirms that a cycle exists in the linked list.
 * Storing the entire node in the map is essential to distinguish between nodes with identical values but different positions in the list. This ensures accurate loop detection and not just duplicate value checks.
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
13    public boolean hasCycle(ListNode head) {
14        if(head==null||head.next==null){
15            return false;
16        }
17        ListNode slow=head;
18        ListNode fast=head;
19        while(fast!=null&&fast.next!=null&&slow!=null){
20            slow=slow.next;
21            fast=fast.next.next;
22            if(fast==slow){
23                return true;
24            }
25        }
26        return false;
27    }
28}