class Solution {
    public int lower(int nums[], int x){
        int n=nums.length;
        int low=0;
        int high=n-1;
        int ans=n;
        while(low<=high){
            int mid=(high+low)/2;
            if(nums[mid]>=x){
                ans=mid;
                high=mid-1;
            }
            else low=mid+1;
        }
        return ans;
    }
    public int upper(int nums[], int x){
        int n=nums.length;
        int low=0;
        int high=n-1;
        int ans=n;
        while(low<=high){
            int mid=(high+low)/2;
            if(nums[mid]>x){
                ans=mid;
                high=mid-1;
            }
            else low=mid+1;
        }
        return ans;
    }
    public int[] searchRange(int[] nums, int target) {
        int l=lower(nums, target);
        int n=nums.length;
        int u=upper(nums,target)-1;
        if(l==n || nums[l]!=target) return new int [] {-1, -1};
        return new int[]{l, u};
    }
}