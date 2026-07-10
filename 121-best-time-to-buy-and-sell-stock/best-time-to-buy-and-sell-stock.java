class Solution {
    public int maxProfit(int[] a) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        
        for(int i=0;i<a.length;i++)
        {
            min = Math.min(min,a[i]);
            int profit=a[i]-min;
            max = Math.max(max,profit);
        }
        return max;
    }
}