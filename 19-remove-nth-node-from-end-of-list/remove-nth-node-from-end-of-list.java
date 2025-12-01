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
    ListNode temp=head;
    int l=0;//length
    while(temp!=null){
        temp=temp.next;
        l++;
    }    
    int steps=l-n; 
    if (l == n) { //delete the head element
            return head.next;
        }
    temp=head;
    for(int i=1;i<steps;i++){ 
        temp=temp.next;
    }
    temp.next=temp.next.next; //deleted here
    return head;
    }
}