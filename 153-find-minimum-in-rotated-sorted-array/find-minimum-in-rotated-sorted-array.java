class Solution {
    public int findMin(int[] nums) {
        // int low = 0;
        // int high = nums.length - 1;
        // while (low < high) {
        //     int mid = low + (high - low) / 2;
        //     if (nums[mid] > nums[high]) {
        //         low = mid + 1;
        //     } else {
        //         high = mid;
        //     }
        // }
        // return nums[low];
        int min=Integer.MAX_VALUE;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]<min) min=nums[i];
        }
        return min;
    }
}