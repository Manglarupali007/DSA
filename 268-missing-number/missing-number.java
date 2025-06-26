class Solution {
    public int missingNumber(int[] nums) {
        int range=nums.length;
        int actualsum=(range*(range+1))/2;  //formula
      int currentsum=0;
      for(int i=0;i<nums.length;i++){
        currentsum+=nums[i];
      }  
      int ans=actualsum-currentsum;
      return ans;
    }
}