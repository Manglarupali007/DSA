class Solution {
    public int maxProduct(int[] nums) {
        int max=-1;
        int smax=-1;
        for(int i=0;i<=nums.length-1;i++){
            if(nums[i]>max){
                smax=max;
                max=nums[i];
        }
        else if(smax<nums[i]){
            smax=nums[i];
        }
        }
        int product=(max-1) * (smax-1);
        return product;
    }
}