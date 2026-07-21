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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null) return null;
        ListNode tail=head;
        int n=1;
        while(tail.next!=null){
            tail=tail.next;
            n++;
        }
        k=k%n;
        tail.next=head;
        int steps=n-k-1;
        ListNode newtail=head;
        while(steps-->0){
            newtail=newtail.next;
        }
        ListNode newhead=newtail.next;
        newtail.next=null;
        return newhead;
    }
}