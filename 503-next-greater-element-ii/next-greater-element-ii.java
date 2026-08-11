class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n=nums.length;
        int ans[]=new int[n];
        Stack<Integer> st=new Stack<>();
        for(int i=n*2-1;i>=0;i--){
            int idx=i%n;
            while(!st.isEmpty() && st.peek()<=nums[idx]) st.pop();
            if(!st.isEmpty()) ans[idx]=st.peek();
            else ans[idx]=-1;
            st.push(nums[idx]);
        }
        return ans;
    }
}