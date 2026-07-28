Given the head of a singly linked list, reverse the list, and return the reversed list.

 
Example 1:

Input: head = [1,2,3,4,5]
Output: [5,4,3,2,1]


Example 2:

Input: head = [1,2]
Output: [2,1]


Example 3:

Input: head = []
Output: []


 
Constraints:


	The number of nodes in the list is the range [0, 5000].
	-5000 <= Node.val <= 5000


 
Follow up: A linked list can be reversed either iteratively or recursively. Could you implement both?


recursive approach: 
break the problem into smaller and smaller parts
solve it for the smallest first 
here smallest => only one node => return the head itself

next smallest 2 nodes : 
eg: 2->5->null
for this 
2.next=5.next i.e null
5.next=2
which gives 5->2-> null
return 5 i.e. the new head
The recursive approach reverses the linked list by breaking it into sub-problems: 
Base Case: If the list is empty or has one node, return the head .
Recursive Call: Recursively call the function for head.next to reach the end of the list .
Pointer Reversal: As the recursion unwinds, point the next node back to the current head (head.next.next = head) and set the current head.next to null 
Result: The new head is passed back up the call stack until the entire list is reversed.
 

time complexity : O(n)
space complexity:O(n) {due to recursive stack space}
