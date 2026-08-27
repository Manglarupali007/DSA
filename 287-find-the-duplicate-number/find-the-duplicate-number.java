class Solution {
    public int findDuplicate(int[] nums) {
        int freq[]=new int[100001];
        for(int i=0;i<nums.length;i++){
            freq[nums[i]]++;
        }
        for(int i=0;i<nums.length;i++){
            if(freq[nums[i]]>=2) return nums[i];
        }
        return -1;
    }
}