class Solution {
    public int findPeakElement(int[] nums) {
        // for (int i = 0; i < nums.length - 1; i++) {
        //     if (nums[i]>nums[i+1]) {
        //         return i; 
        //     }
        // }
        // return nums.length - 1; 

     int max = Integer.MIN_VALUE;
        int idx=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
                idx=i;
            }
        }
        return idx;
        }
}