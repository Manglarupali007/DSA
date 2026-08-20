class Solution {
    public int trap(int[] height) {
        int left=0;
        int n=height.length;
        int right=n-1;
        int water=0;
        int lmax=0, rmax=0;
        while(left<right){
            if(height[left]<height[right]){
                if(lmax<height[left]) lmax=height[left];
            else water+=lmax-height[left];
            left++;
            }
            else{
                if(rmax<height[right]) rmax=height[right];
                else water+=rmax-height[right];
                right--;
            }
        }
        return water;
    }
}