class Solution {
    int canMake(int [] day, int mid, int k){
        int bouq_count=0;
        int cons_count=0;
        int n=day.length;
        for(int i=0;i<n;i++){
            if(day[i]<=mid) cons_count++;
            else cons_count=0;
            if(cons_count==k){
                bouq_count++;
                cons_count=0;
            }
        }
        return bouq_count;
    }
    public int minDays(int[] bloomDay, int m, int k) {
        int n=bloomDay.length;
        if((m*k)>n) return -1;
        int max=-1;
        for(int i=0;i<n;i++){
            max=Math.max(max,bloomDay[i]);
        }
        int low=0;
        int high=max;
        int min=-1;
        while(low<=high){
            int mid=(high+low)/2;
            if(canMake(bloomDay,mid,k)>=m){
                min=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
         return min;
    }
}