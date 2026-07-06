class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int n=height.length;
        int right=n-1;
        int max=0;
        while(left<right){
            int min_height=Math.min(height[left],height[right]);
            int width=right-left;
            max=Math.max(max,min_height*width);
            if(height[left]<height[right]) left++;
            else right--;
        }
        return max;
    }
}