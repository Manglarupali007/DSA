class Solution {
public:
    int maxSubArray(vector<int>& nums) {
       int summ=0;
       int maxx=INT_MIN;
       for(int val: nums){
        summ+=val;
        maxx=max(summ,maxx);
        if(summ<0){
            summ=0;
        }
       } 
       return maxx;
    }
};