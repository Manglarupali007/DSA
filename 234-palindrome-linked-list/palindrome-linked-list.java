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
    public boolean isPalindrome(ListNode head) {
        // if(head==null){
        //     return true;
        // }
        // ArrayList<Integer> list=new ArrayList<>();
        // ListNode temp=head;
        // while(temp!=null){
        //     list.add(temp.val);
        //     temp=temp.next;
        // }
        // int i=0;
        // int j=list.size()-1;

        // while(i<j){
        //     if(!list.get(i).equals(list.get(j))){
        //         return false;
        //     }
        //     i++;
        //     j--;
        // }
        // return true;




        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }

        ListNode prev=null;
        while(slow!=null){
            ListNode temp=slow.next;
            slow.next=prev;
            prev=slow;
            slow=temp;
        }

        while(prev!=null){
            if(head.val!=prev.val){
                return false;
            }
            head=head.next;
            prev=prev.next;
        }
        return true;
    }
}