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
    public ListNode deleteDuplicates(ListNode head) {
    if (head == null) return head;

    ListNode temp = head;
    ListNode itr  = head.next;

    while (itr != null) {
        if (temp.val == itr.val) {
            temp.next = itr.next;
            itr = temp.next;
        } else {
            temp = temp.next;
            itr = itr.next;
        }
    }
        return head;
    }
}