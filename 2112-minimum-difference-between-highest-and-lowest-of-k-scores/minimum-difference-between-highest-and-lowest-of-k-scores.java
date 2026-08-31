class Solution {
    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int n=nums.length;
        if(n==1) return 0;
        int sub=0;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<=n-k;i++){
            sub=nums[i+k-1]-nums[i];
            min=Math.min(min,sub);
        }
        return min;
    }
}