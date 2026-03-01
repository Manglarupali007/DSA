class Solution {
    public int[] getConcatenation(int[] nums) {
        ArrayList<Integer> arr=new ArrayList<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            arr.add(nums[i]);
        }
        for(int i=0;i<n;i++){
            arr.add(nums[i]);
        }
        int l=arr.size();
        int ans[]=new int[l];
        for(int i=0;i<l;i++){
            ans[i]=arr.get(i);
        }
        return ans;
    }
}