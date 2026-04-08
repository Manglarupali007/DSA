class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int a_sum=0;
        for(int i=0;i<=n;i++){
            a_sum+=i;
        }
        int b_sum=0;
        for(int i=0;i<n;i++){
            b_sum+=nums[i];
        }
return a_sum-b_sum;
    }
}