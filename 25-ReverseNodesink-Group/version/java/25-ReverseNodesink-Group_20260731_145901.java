// Last updated: 7/31/2026, 2:59:01 PM
/*
 * Approach
 * Maintain two pointers
 * temp → points to the first node of the current group.
 * prevNode → points to the tail of the previously reversed group. It is used to connect consecutive groups.
 * Find the kth node
 * Starting from temp, move k-1 steps to reach the last node of the current group (kthNode).
 * If kthNode == null, fewer than k nodes remain, so leave them as they are and connect the previous group's tail (prevNode) to temp.
 * Save the next group
 * 
 * Store
 * 
 * nextNode = kthNode.next;
 * This is crucial because after reversing the current group, we would otherwise lose the reference to the remaining list.
 * Detach the current group
 * 
 * Break the link:
 * 
 * kthNode.next = null;
 * Now the current group is an independent linked list that can be safely reversed.
 * Reverse the detached group
 * Reverse the isolated list.
 * The old head (temp) becomes the tail, and the old tail (kthNode) becomes the new head.
 * Reconnect the pointers
 * There are three important connections:
 * Connection 1: Previous group → Current group
 * 
 * If this is the first group:
 * 
 * head = newHead;
 * 
 * Otherwise:
 * 
 * prevNode.next = newHead;
 * This connects the previously processed part of the list to the newly reversed group.
 * Connection 2: Current group → Next group
 * 
 * Since temp becomes the tail after reversal:
 * 
 * temp.next = nextNode;
 * This reconnects the reversed group to the remaining unreversed nodes.
 * Connection 3: Prepare for the next iteration
 * 
 * Update
 * 
 * prevNode = temp;
 * temp = nextNode;
 * prevNode now points to the tail of the reversed group, ready to connect with the next reversed group.
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
12
13    private ListNode reverse(ListNode list) {
14        ListNode prev = null;
15        ListNode curr = list;
16
17        while (curr != null) {
18            ListNode next = curr.next;
19            curr.next = prev;
20            prev = curr;
21            curr = next;
22        }
23
24        return prev;
25    }
26
27    private ListNode getkthNode(ListNode temp, int k) {
28        while (temp != null && k > 0) {
29            temp = temp.next;
30            k--;
31        }
32        return temp;
33    }
34
35    public ListNode reverseKGroup(ListNode head, int k) {
36
37        if (head == null || k == 1)
38            return head;
39
40        ListNode temp = head;
41        ListNode prevNode = null;
42
43        while (temp != null) {
44
45            ListNode kthNode = getkthNode(temp, k - 1);
46
47            if (kthNode == null) {
48                if (prevNode != null)
49                    prevNode.next = temp;
50                break;
51            }
52
53            ListNode nextNode = kthNode.next;
54            kthNode.next = null;
55
56            ListNode newHead = reverse(temp);
57
58            if (temp == head)
59                head = newHead;
60            else
61                prevNode.next = newHead;
62
63            temp.next = nextNode;
64
65            prevNode = temp;
66            temp = nextNode;
67        }
68
69        return head;
70    }
71}