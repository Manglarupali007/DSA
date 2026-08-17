class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> st=new Stack<>();
        int h=heights.length;
        int max=0;
        for(int i=0;i<=h;i++){
            int curr;
            if(i==h) curr=0;
            else curr=heights[i];
            while(!st.isEmpty() && curr<heights[st.peek()]){
                int idx=st.pop();
                int height=heights[idx];
                int width=st.isEmpty()?i:i-st.peek()-1;
                int area=height*width;
                max=Math.max(area,max);
            }
            st.push(i);
        }
        return max;
    }
}