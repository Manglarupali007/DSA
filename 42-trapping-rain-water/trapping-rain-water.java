class Solution {
    public int trap(int[] height) {
        // int n=height.length;
        // int[] leftmax=new int[n];
        // int [] rightmax=new int[n];
        // leftmax[0]=height[0];
        // for(int i=1;i<n;i++){
        //     leftmax[i]=Math.max(leftmax[i-1], height[i]);
        // }
        // rightmax[n - 1] = height[n - 1];
        // for (int i= n- 2; i >= 0; i--) {
        //     rightmax[i] = Math.max(rightmax[i + 1], height[i]);
        // }
        // int water=0;
        // for(int i=0;i<n;i++){
        //     water+=Math.min(leftmax[i],rightmax[i])-height[i];
        // }
        // return water;



        int n=height.length;
        int left=0;
        int right=n-1;
        int lmax=0;
        int rmax=0;
        int water=0;
        while(left<right){
            if(height[left]<height[right]){
                if(height[left]>lmax){
                    lmax=height[left];
                }
                else{
                    water+=lmax-height[left];
                }
                left++;
            }
            else{
             if(height[right]>rmax){
                    rmax=height[right];
                }
                else{
                    water+=rmax-height[right];
                }
                right--;   
            }
        }
        return water;
    }
}