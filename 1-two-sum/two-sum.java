class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        Map<Integer,Integer> map=new HashMap();
        int res[]= new int[2];
        Arrays.fill(res,0);
        for(int i=0;i<n;i++){
            int diff=target-nums[i];
            if(map.containsKey(diff)){
                res[0]=map.get(diff);
                res[1]=i;
                return res;
            }
            map.put(nums[i],i);
        }
        return res;
    }
}