class Solution {
    public int majorityElement(int[] nums) {
        // int n=nums.length;
        // int majority=n/2;
        // for(int i=0;i<n;i++){
        //     int count=0;
        //     for(int j=0;j<n;j++){
        //         if(nums[i]==nums[j]){
        //             count++;
        //         }
        //     }
        //     if(count>majority){
        //         return nums[i];
        //     }
        // }
        // return -1;



        int n=nums.length;
        int candidate=0;
        int count=0;
        for(int i=0;i<n;i++){
            if(count==0){
                candidate=nums[i];
            }
            if(candidate==nums[i]){
                count++;
            }
            else{
                count--;
            }
        }
        return candidate;
    }
}