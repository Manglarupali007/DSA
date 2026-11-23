// class Solution {
//     public int findDuplicate(int[] nums) {
//         Arrays.sort(nums);
//         int n=nums.length;
//         for(int i=1;i<n;i++){
//             if(nums[i]==nums[i-1]) return nums[i];
//         }
//         return -1;
//     }
// }




class Solution {
    public int findDuplicate(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        int ans=-1;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(set.contains(nums[i])) ans=nums[i];
            set.add(nums[i]);
        }
        return ans;
    }
}