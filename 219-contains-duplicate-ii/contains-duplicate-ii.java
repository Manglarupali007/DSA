class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map <Integer,Integer> set = new HashMap<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(set.containsKey(nums[i])) {
                if(i - set.get(nums[i]) <= k) return true;
            }
            set.put(nums[i],i);
        }
        return false;
    }
}