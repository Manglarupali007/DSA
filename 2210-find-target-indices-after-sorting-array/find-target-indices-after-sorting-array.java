class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        int n=nums.length;
        for(int i=0;i<n-1;i++){
            int min=i;
            for(int j=i+1;j<n;j++){
                if(nums[min]>nums[j]){
                    min=j;
                }
            }
            int temp=nums[i];
            nums[i]=nums[min];
            nums[min]=temp;
        }
        List<Integer> result = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target)
{
result.add(i);
}        }
return result;
    }
}