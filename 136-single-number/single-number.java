class Solution {
    public int singleNumber(int[] nums) {
        int res=0;
        for(int i=0;i<nums.length;i++){
            res^=nums[i]; //XOR with same number results in 0 and XOR with 0  will replace with number itself;
        }
        return res;
    }
}