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
    public ListNode reverseList(ListNode head) {
        ListNode temp=null;
        ListNode itr=head;
        while(itr!=null){
           ListNode newNode=new ListNode(itr.val);
           newNode.next=temp;
           temp=newNode;
           itr=itr.next;
        }
        return temp;
    }
}