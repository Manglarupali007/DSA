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
    public ListNode removeNthFromEnd(ListNode head, int n) {
    ListNode tail=head;
    int l=1;
    while(tail.next!=null){
        tail=tail.next;
        l++;
    }    
    int steps=l-n;
    if (l == n) {
            return head.next;
        }

    tail=head;
    for(int i=1;i<steps;i++){
        tail=tail.next;
    }
    tail.next=tail.next.next;
    return head;
    }
}