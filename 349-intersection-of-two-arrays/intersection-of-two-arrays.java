class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set <Integer> st1 = new TreeSet<>();
        Set <Integer> st2 = new TreeSet<>();
        for(int i=0;i<nums1.length;i++){
            st1.add(nums1[i]);
        }
        for(int i=0;i<nums2.length;i++){
            if(st1.contains(nums2[i])){
            st2.add(nums2[i]);
        }
    }
int ans[]= new int [st2.size()];
int idx=0;
for(int num : st2){
    ans[idx++]=num;
}
return ans;
    }
}