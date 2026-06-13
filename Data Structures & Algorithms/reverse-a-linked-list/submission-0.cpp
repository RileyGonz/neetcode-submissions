/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */

class Solution {
public:
    ListNode* reverseList(ListNode* head) {
        ListNode* prev = nullptr;  // Tracks the node behind curr
        ListNode* curr = head;     // Tracks the node being flipped
        
        while (curr != nullptr) {
            ListNode* nextNode = curr->next; // 1. Save the rest of the list
            curr->next = prev;              // 2. Flip the pointer backward
            prev = curr;                    // 3. Move prev one step forward
            curr = nextNode;                // 4. Move curr one step forward
        }
        
        return prev; // 
    }
};
