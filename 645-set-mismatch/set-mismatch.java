class Solution {
    public int[] findErrorNums(int[] nums) {
        Arrays.sort(nums);
        int ans[]=new int[2];
        int n=nums.length;
        int count=0;
        for(int i=1;i<n;i++){
            if(nums[i-1] == nums[i]) ans[0]=nums[i];
        }
        int total=n*(n+1)/2;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
        }
        ans[1]=ans[0]+total-sum;
        return ans;
    }
}