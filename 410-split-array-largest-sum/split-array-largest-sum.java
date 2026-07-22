class Solution {
    public int splitArray(int[] nums, int k) {
        int n=nums.length;
        int low=0;
        int high=0;
        for(int i=0;i<n;i++){
            low=Math.max(nums[i],low);
            high+=nums[i];
        }
        while(low<=high){
            int mid=(high+low)/2;
            int sub=1;
            int sum=nums[0];
            for(int i=1;i<n;i++){
            if(sum+nums[i]<=mid){
                sum+=nums[i];
            }
            else{
                sub++;
                sum=nums[i];
            }
        }
        if(sub<=k){
            high=mid-1;
        }
        else{
            low=mid+1;
        }
    }
    return low;
}
}