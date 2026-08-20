class Solution {
    public int[] resultArray(int[] nums) {
        int n=nums.length;
        ArrayList<Integer> arr1=new ArrayList<>();
        ArrayList<Integer> arr2=new ArrayList<>();
        arr1.add(nums[0]);
        arr2.add(nums[1]);
        for(int i=2;i<n;i++){
            int last1=arr1.get(arr1.size()-1);
            int last2=arr2.get(arr2.size()-1);
            if(last1>last2) arr1.add(nums[i]);
            else arr2.add(nums[i]);
        }
        int ans[]=new int[n];
        int j=0;
        for(int i=0;i<arr1.size();i++) ans[j++]=arr1.get(i);
        for(int i=0;i<arr2.size();i++) ans[j++]=arr2.get(i);
        return ans;
    }
}