class Solution {
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int n=position.length;
        int ans=-1;
        int low=0;
        int high=position[n-1]-position[0];
        while(low<=high){
            int mid=(high+low)/2;
            int ball=1;
            int last=position[0];
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
        return ans;
    }
}