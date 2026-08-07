class Solution {
    public int findMiddleIndex(int[] nums) {
        int n=nums.length;
        int[]prefix=new int[n];
        prefix[0]=nums[0];
        for(int i=1;i<n;i++){
            prefix[i]=prefix[i-1]+nums[i];
        }
        int total=prefix[n-1];
        int left, right;
        for(int i=0;i<n;i++){
            if(i==0){
                 left=0;
            }
            else left=prefix[i-1];
            right=total-prefix[i];
            if(left==right) return i;
        }
        return -1;
    }
}