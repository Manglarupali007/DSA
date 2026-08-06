class Solution {
    public ListNode deleteMiddle(ListNode head) {
        if (head == null || head.next == null)
            return null;
        int count = 0;
        ListNode tail = head;
        while (tail != null) {
            count++;
            tail = tail.next;
        }
        int middle = count / 2;
        ListNode curr = head;
        for (int i = 1; i < middle; i++) {
            curr = curr.next;
        }
        curr.next = curr.next.next;
        return head;
    }
}