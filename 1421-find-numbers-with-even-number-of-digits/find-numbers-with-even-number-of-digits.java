class Solution {
    public int count(int n){
        int cnt=0;
        while(n>0){
            cnt++;
            n/=10;
        }
        return cnt;
    }
    public int findNumbers(int[] nums) {
        int n=nums.length;
        int ans=0;
        for(int i=0;i<n;i++){
            if(count(nums[i]) % 2 == 0 ) ans++;
        }
        return ans;
    }
}