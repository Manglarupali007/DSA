class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int [] merged=new int [m+n];
        int k=0;
        int i=0;
        int j=0;
        while(i<m){
            merged[k++]=nums1[i++];
        }
        while(j<n){
            merged[k++]=nums2[j++];
        }
     Arrays.sort(merged);
for(int s=0;s<merged.length;s++){
    nums1[s]=merged[s];
}
    }
}