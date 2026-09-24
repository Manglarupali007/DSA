class Solution {
    public boolean canAliceWin(int[] nums) {
        int n=nums.length;
        int single=0;
        int doublee=0;
        for(int i=0;i<n;i++){
            if(nums[i]<10) single+=nums[i];
            else doublee+=nums[i];
        }
        return single!=doublee;
    }
}