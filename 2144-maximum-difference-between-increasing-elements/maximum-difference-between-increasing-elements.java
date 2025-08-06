class Solution {
    public int maximumDifference(int[] nums) {
        int min = nums[0];
        int maxDif= -1;
        for(int i=1;i<nums.length;i++){
           if(nums[i]>min){
            maxDif = Math.max(maxDif,nums[i]-min);
           }else{
            min= nums[i];
           }
        }
        return maxDif;        
    }
}