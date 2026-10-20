class Solution {
    public int jump(int[] nums) {
       int n=nums.length;
       int count=0;
       int end=0;
       int max=0;
       for(int i=0;i<n-1;i++){
        if(i>max) return 0;
        max=Math.max(max,i+nums[i]);
        if(i==end){
            count++;
            end=max;
        }
       } 
       return count;
    }
}