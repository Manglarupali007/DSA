class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int min_speed=1;
        int max_speed=0;
        int n=piles.length;
        for(int i=0;i<n;i++){
            max_speed=Math.max(max_speed,piles[i]);
        }
        while(min_speed<=max_speed){
            int mid=(max_speed+min_speed)/2;
            long hours=0;
            for(int i=0;i<n;i++){
                hours+=(piles[i]+mid-1)/mid;
            }
            if(hours<=h) max_speed=mid-1;
            else min_speed=mid+1;
        }
        return min_speed;
    }
}