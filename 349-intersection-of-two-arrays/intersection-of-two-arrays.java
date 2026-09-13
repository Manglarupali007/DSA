class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> st1=new HashSet<>();
        HashSet<Integer> st2=new HashSet<>();
        int n=nums1.length;
        int m=nums2.length;
        for(int i=0;i<n;i++) st1.add(nums1[i]);
        for(int i=0;i<m;i++){
            if(st1.contains(nums2[i])) st2.add(nums2[i]);
        }
        int ans[]=new int[st2.size()];
        int i=0;
        for(int num:st2){
            ans[i++]=num;
        }
        return ans;
    }
}