class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int total=(n*(n+1))/2;  //formula - n=3 (3*4/2 = 6 total sum will be 6 )
      int sum=0;
      for(int i=0;i<nums.length;i++){
        sum+=nums[i];   
      }  
      int ans=total-sum;
      return ans;
    }
}