class Solution {
    public int maxSubArray(int[] nums) {
        int summ=0;
       int maxx=Integer.MIN_VALUE;
       for(int val: nums){
        summ+=val;
        maxx=Math.max(summ,maxx);
        if(summ<0){
            summ=0;
        }
       } 
       return maxx;
    }
}