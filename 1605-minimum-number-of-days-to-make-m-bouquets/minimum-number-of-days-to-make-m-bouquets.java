class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;
        int n=bloomDay.length;
        if ((long)m * k > n)
    return -1;
        for (int i=0;i<n;i++) {
            low = Math.min(low, bloomDay[i]);
            high = Math.max(high, bloomDay[i]);
        }
        while (low <= high) {
            int mid = (high+low)/2;
            int bouquet = 0;
            int count = 0;
            for (int day : bloomDay) {
                if (day <= mid) {
                    count++;
                    if (count == k) {
                        bouquet++;
                        count = 0;
                    }
                } else {
                    count = 0;
                }
            }
            if (bouquet >= m) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }

        }
        return low;
    }
}