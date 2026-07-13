class Solution {
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int n=position.length;
        long ans=-1;
        long low=0;
        long high=position[n-1]-position[0];
        while(low<=high){
            long mid=(high+low)/2;
            long ball=1;
            long last=position[0];
            for(int i=1;i<n;i++){
                if(position[i]-last>=mid){
                    ball++;
                    last=position[i];
                }
            }
                if(ball>=m){
                    ans=mid;
                    low=mid+1;
                }
                else{
                    high=mid-1;
                }
        }
        return (int)ans;
    }
}