class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first=startIndex(nums,target);
        int last=endIndex(nums,target);
        return new int []{first,last};
    }
    public int startIndex(int[] nums, int target) {
        int low = 0, high = nums.length - 1, ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                ans = mid;       
                high = mid - 1;  
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }
   public int endIndex(int[] nums, int target) {
        int low = 0, high = nums.length - 1, ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                ans = mid;       
                low = mid + 1;    
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }
}