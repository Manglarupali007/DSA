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
       int k=0;
       while(temp!=null){
        temp=temp.next;
        k++;
       } 
       
if(n == k){
            return head.next;
        }


          ListNode curr = head;
        for(int i = 1; i < k - n; i++){
            curr = curr.next;
        }
       curr.next=curr.next.next;
       return head;
    }
}