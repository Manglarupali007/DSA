class Solution {
    public int mySqrt(int x) {
        if (x == 0 || x == 1) return x;
        
        int low = 1, high = x, ans = 0;
        
        while (low <= high) {
            int mid = low + (high - low) / 2;
            
            if ((long)mid * mid == x) {
                return mid;
            } else if ((long)mid * mid < x) {
                ans = mid;  // possible answer
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        
        return ans;
    }
}
