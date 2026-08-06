class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null)return head;
        ListNode tail = head;
        int count = 0;
        while(tail!=null){
            count++;
            tail = tail.next;
        }
        if(count==n) return head.next;
        int k = count-n;
        ListNode curr = head;
        for(int i=1;i<k;i++){
            curr = curr.next;
        }
        curr.next=curr.next.next;
        return head;
    }
}