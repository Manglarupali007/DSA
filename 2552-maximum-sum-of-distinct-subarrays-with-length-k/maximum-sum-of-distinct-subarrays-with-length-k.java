class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int n=nums.length;
        int left=0;
        int right=0;
        long sum=0;
        long max=0;
        HashSet<Integer> st=new HashSet<>();
        while(right<n){
               while (st.contains(nums[right])) {
                sum -= nums[left];
                st.remove(nums[left]);
                left++;
            }
            sum+=nums[right];
            st.add(nums[right]);
            if(right-left+1 ==k){
                if(st.size()==k){
                    max=Math.max(max,sum);
                }
                sum-=nums[left];
                st.remove(nums[left]);
                left++;
            }
            right++;
        }
        return max;
    }
}