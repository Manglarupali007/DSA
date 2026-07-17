class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low=1;
        int high=0;
        int n=piles.length;
        for(int i=0;i<n;i++){
            high=Math.max(high,piles[i]);
        }
        while(low<=high){
            int mid=(high+low)/2;
            long hours=0;
            for(int i=0;i<n;i++){
                hours+=(piles[i]+mid-1)/mid;
            }
            if(hours<=h) high=mid-1;
            else low=mid+1;
        }
        return low;
    }
}