/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode curr = null; 
        ListNode head = null;
        ListNode pointer1 = list1;
        ListNode pointer2 = list2;
        if(pointer1 == null){
            return pointer2;
        }
        if(pointer2 == null){
            return pointer1;
        }
        if(pointer1.val < pointer2.val){
            head = pointer1;
            pointer1 = pointer1.next;
        }else{
            head = pointer2;
            pointer2 = pointer2.next;
        }
        curr = head;
        while(pointer1 != null && pointer2 != null){
            if(pointer1.val < pointer2.val){
                curr.next = pointer1;
                pointer1 = pointer1.next;
            }else{
                curr.next = pointer2;
                pointer2 = pointer2.next;
            }
            curr = curr.next;
        }
        if(pointer1 != null){
            curr.next = pointer1;
        }else if(pointer2 != null){
            curr.next = pointer2;
        }
        return head;
    }
}