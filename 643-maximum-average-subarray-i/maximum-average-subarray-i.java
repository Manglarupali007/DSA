class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum=0;
        int left=0;
        int right=0;
        int n=nums.length;
        double max=Double.NEGATIVE_INFINITY;
        while(right<n){
            sum+=nums[right];
            if(right-left+1 == k){
                double avg=(double)sum/k;
                max=Math.max(max,avg);
                sum-=nums[left];
                left++;
            }
            right++;
        }
        return max;
    }
}