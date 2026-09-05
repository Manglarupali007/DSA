class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            int sum=0;
            for(int j=i;j<nums.length;j++){
                sum+=nums[j];
                if(sum==goal) count++;
            }
        }
        return count;



        // HashMap<Integer,Integer> map=new HashMap<>();
        // map.put(0,1);
        // int count=0;
        // int sum=0;
        // int n=nums.length;
        // for(int i=0;i<n;i++){
        //     sum+=nums[i];
        //     int reqd=sum-goal;
        //     if(map.containsKey(reqd)) count+=map.get(reqd);
        //     map.put(sum,map.getOrDefault(sum,0)+1);
        // }
        // return count;
    }
}