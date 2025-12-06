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
    public ListNode swapNodes(ListNode head, int k) {
        if(head==null || head.next==null) return head;
        ListNode temp=head;
        int n=0;
        while(temp!=null){
temp=temp.next;
n++;
        }
        ListNode first=head;
        for(int i=1;i<k;i++){
            first=first.next;
        }
        ListNode last=head;
        for(int j=1;j<n-k+1;j++){
            last=last.next;
        }
        int swap=first.val;
        first.val=last.val;
        last.val=swap;

        return head;
    }
}