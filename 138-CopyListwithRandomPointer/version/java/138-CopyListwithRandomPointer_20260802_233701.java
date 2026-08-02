// Last updated: 8/2/2026, 11:37:01 PM
1/*
2// Definition for a Node.
3class Node {
4    int val;
5    Node next;
6    Node random;
7
8    public Node(int val) {
9        this.val = val;
10        this.next = null;
11        this.random = null;
12    }
13}
14*/
15
16class Solution {
17     public Node copyRandomList(Node head) {
18        if (head == null)
19            return null;
20
21        HashMap<Node, Node> map = new HashMap<>();
22
23        Node curr = head;
24
25        // Create copy nodes
26        while (curr != null) {
27            map.put(curr, new Node(curr.val));
28            curr = curr.next;
29        }
30
31        curr = head;
32
33        // Connect next and random
34        while (curr != null) {
35            Node copy = map.get(curr);
36
37            copy.next = map.get(curr.next);
38            copy.random = map.get(curr.random);
39
40            curr = curr.next;
41        }
42
43        return map.get(head);
44    }
45}