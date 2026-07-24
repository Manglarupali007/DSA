class Solution {
    public int maxProduct(int[] nums) {
        int max=-1;
        int smax=-1;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]>max){
                smax=max;
                 max=nums[i];
            }
            else if(nums[i]>smax){
                smax=nums[i];
            }
        }
        return (max-1)*(smax-1);
    }
}