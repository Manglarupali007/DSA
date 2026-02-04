class Solution {
    public int pivotIndex(int[] nums) {

        for (int l = 0; l < nums.length; l++) {

            int sum1 = 0;
            int sum2 = 0;
            for (int i = 0; i < l; i++) {
                sum1 += nums[i];
            }

            for (int j = l + 1; j < nums.length; j++) {
                sum2 += nums[j];
            }

            if (sum1 == sum2) {
                return l;
            }
        }

        return -1;
    }
}
