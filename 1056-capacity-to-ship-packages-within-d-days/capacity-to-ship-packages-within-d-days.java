class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low=0;
        int high=0;
        int n=weights.length;
        for(int i=0;i<n;i++){
            low=Math.max(low,weights[i]);
            high+=weights[i];
        }
        while(low<=high){
            int mid=(high+low)/2;
            int day=1;
            int sum=0;
            for(int i=0;i<n;i++){
                if(sum+weights[i]>mid){
                    day++;
                    sum=0;
                }
                sum+=weights[i];
            }
            if(day>days) low=mid+1;
            else high=mid-1;
        }
        return low;
    }
}