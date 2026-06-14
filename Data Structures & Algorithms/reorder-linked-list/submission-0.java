/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) {\ this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public void reorderList(ListNode head) {
        if (head == null || head.next == null) return;
        ListNode curr = head;
        ListNode pointer1_check = curr;
        ListNode pointer2_check = curr;
        while(pointer2_check != null && pointer2_check.next != null){
            pointer1_check = pointer1_check.next;
            pointer2_check = pointer2_check.next.next;
        }

        ListNode mid = pointer1_check.next;
        pointer1_check.next = null;

        ListNode prev = null;
        ListNode curr_rev = mid;
        
        while (curr_rev != null) {
            ListNode nextNode = curr_rev.next;
            curr_rev.next = prev;
            prev = curr_rev;
            curr_rev = nextNode;
        }
        
        ListNode list1 = head;
        ListNode list2 = prev;

        while(list1 != null && list2 != null){
            ListNode temp1 = list1.next;
            ListNode temp2 = list2.next;
            list1.next = list2;
            list2.next = temp1;
            list1 = temp1;
            list2 = temp2;
        }
        
        return;
    }
}