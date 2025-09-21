class Solution {
    public int thirdMax(int[] nums) {
        long max = Long.MIN_VALUE;
        long smax = Long.MIN_VALUE;
        long tmax = Long.MIN_VALUE;
        for (int n : nums) {
            if (n > max) {
                max = n;
            }
        }
        for (int n : nums) {
            if (n > smax && n < max) {
                smax = n;
            }
        }
        for (int n : nums) {
            if (n > tmax && n < smax) {
                tmax = n;
            }
        }
        return (tmax == Long.MIN_VALUE) ? (int) max : (int) tmax;
    }
}
