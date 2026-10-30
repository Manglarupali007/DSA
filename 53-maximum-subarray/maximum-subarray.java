class Solution {
    public int maxSubArray(int[] nums) {
        int n=nums.length;
        int best=nums[0];
        int ans=nums[0];
        for(int i=1;i<n;i++){
            int b1=best+nums[i];
            int b2=nums[i];
            best=Math.max(b1,b2);
            ans=Math.max(ans,best);
        }
        return ans;
    }
}