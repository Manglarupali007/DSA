class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer> set=new HashSet<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            set.add(nums[i]);
        }
        for(int i=1;i<=n+2;i++){
            int pro=k*i;
            if(set.contains(pro))continue;
            else return pro;
        }
        // if(n==1) return k*2;
        return-1;
    }
}