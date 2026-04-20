class Solution {
    public int thirdMax(int[] nums) {
        int n=nums.length;
        long max=Long.MIN_VALUE;
         long smax=Long.MIN_VALUE;
          long tmax=Long.MIN_VALUE;
          for(int val:nums){
            if(val>max){
                max=val;
            }
          }
          for(int val:nums){
            if(val>smax && val!=max){
                smax=val;
            }
          }
          for(int val:nums){
            if(val>tmax && (val!=max && val!=smax)){
tmax=val;
            }
          }
              return (tmax == Long.MIN_VALUE) ? (int) max : (int) tmax;
    }
}