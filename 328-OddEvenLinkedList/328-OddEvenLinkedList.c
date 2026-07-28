// Last updated: 7/28/2026, 5:10:14 PM
/*struct ListNode {
    int val;
    struct ListNode *next;
};*/

struct ListNode* oddEvenList(struct ListNode* head) {
    if (!head || !head->next)
        return head;

    struct ListNode *odd = head;
    struct ListNode *even = head->next;
    struct ListNode *evenHead = even;

    while (even && even->next) {
        odd->next = even->next;
        odd = odd->next;

        even->next = odd->next;
        even = even->next;
    }

    odd->next = evenHead;
    return head;
}

