class Solution {
    public int dominantIndex(int[] nums) {
        int n=nums.length;
        int max=-1;
        int idx=-1;
        for(int i=0;i<n;i++){
           if(nums[i]>max){
            max=nums[i];
            idx=i;
           }
        }
        for(int i=0;i<n;i++){
            if(i!=idx && 2*nums[i]> max){
                return -1;
            }
        }
        return idx;
    }
}