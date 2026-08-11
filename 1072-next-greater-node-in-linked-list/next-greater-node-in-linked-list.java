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
    public int[] nextLargerNodes(ListNode head) {
        List<Integer> list=new ArrayList<>();
        ListNode temp=head;
        while(temp!=null){
            list.add(temp.val);
            temp=temp.next;
        }
          Stack<Integer> st=new Stack<>();
        int n=list.size();
        int [] ans=new int[n];
        for(int i=n-1;i>=0;i--){
        while(!st.isEmpty() && st.peek()<=list.get(i)) st.pop();
        if(!st.isEmpty()) ans[i]=st.peek();
        else ans[i]=0;
        st.push(list.get(i));
        }
        return ans;
    }
}