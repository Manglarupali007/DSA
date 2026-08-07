class Solution {
    public int findMiddleIndex(int[] nums) {
        int total=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            total+=nums[i];
        }
        int left=0;
        for(int i=0;i<n;i++){
            int right=total-left-nums[i];
            if(left==right) return i;
            left+=nums[i];
        }
        return -1;
    }
}