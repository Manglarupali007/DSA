class Solution {
    public int digit(int n){
        int sum=0;
        while(n>0){
            int last=n%10;
            sum+=last;
            n/=10;
        }
        return sum;
    }
    public int smallestIndex(int[] nums) {
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(digit(nums[i])==i) return i;
        }
        return -1;
    }
}