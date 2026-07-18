class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> st1= new HashSet<>();
        HashSet<Integer> st2= new HashSet<>();
        int n1=nums1.length;
        int n2=nums2.length;
        for(int i=0;i<n1;i++){
            st1.add(nums1[i]);
        }
        for(int i=0;i<n2;i++){
            if(st1.contains(nums2[i])){
                st2.add(nums2[i]);
            }
        }
        int ans[]=new int[st2.size()];
        int i=0;
        for(int num:st2){
            ans[i++]=num;
        }
        return ans;
    }
}