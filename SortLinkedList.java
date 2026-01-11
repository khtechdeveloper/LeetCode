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
    public ListNode sortList(ListNode head) {
        // ListNode temp=head;
        // while(temp!=null){
        //     ListNode min=temp;
        //     ListNode itr=temp.next;
        //     while(itr!=null){
        //         if(min.val>itr.val){
        //             min=itr;
        //         }
        //         itr=itr.next;
        //     }
        //     int flag=temp.val;
        //     temp.val=min.val;
        //     min.val=flag;
        //     temp=temp.next;
        // }
        // return head;

        // 2nd way

        List<Integer> list=new ArrayList();
        ListNode temp=head;
        while(temp!=null){
            list.add(temp.val);
            temp=temp.next;
        }
        temp=head;
        Collections.sort(list);
        for(int val: list){
            temp.val=val;
            temp=temp.next;
        }
        return head;
    }
}