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
    public ListNode oddEvenList(ListNode head) {
        if(head==null ||head.next==null){
            return head;
        }
        ListNode oddhead=head, oddtail=head;
        ListNode evenhead=head.next, eventail=head.next;
        ListNode curr=head.next.next;
        boolean odd=true;
        while(curr!=null){
            if(odd){
                oddtail.next=curr;
                oddtail=curr;
            }
            else{
                eventail.next=curr;
                eventail=curr;
            }
            curr=curr.next;
            odd=!odd;
        }
        oddtail.next=evenhead;
        eventail.next=null;
        return oddhead;
    }
}