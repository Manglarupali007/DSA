class Solution {
    public int thirdMax(int[] nums) {
        int n=nums.length;
        long max=Long.MIN_VALUE;
        long smax=Long.MIN_VALUE;
        long tmax=Long.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(nums[i]>max) max=nums[i];
        }
        for(int i=0;i<n;i++){
            if(nums[i]!=max && nums[i]>smax) smax=nums[i];
        }
        for(int i=0;i<n;i++){
            if(nums[i]!=max && nums[i]!=smax && nums[i]>tmax) tmax=nums[i];
        }
        if(tmax==Long.MIN_VALUE) return (int)max;
        return (int)tmax;
    }
}