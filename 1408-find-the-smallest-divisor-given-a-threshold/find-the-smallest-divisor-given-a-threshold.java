class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int max=-1;
        int n=nums.length;
        for(int i=0;i<n;i++){
            max=Math.max(max,nums[i]);
        }
        int low=1;
        int high=max;
        while(low<=high){
            int mid=(high+low)/2;
            int sum=0;
            for(int i=0;i<n;i++){
                sum+=(nums[i]+mid-1)/mid;
            }
            if(sum>threshold){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return low;
    }
}