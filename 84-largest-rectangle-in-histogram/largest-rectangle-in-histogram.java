class Solution {
    public int largestRectangleArea(int[] heights) {
     Stack<Integer> st = new Stack<>();
     int h = heights.length;
     int maxarea = 0;
     for(int i = 0 ; i<=h;i++){
        int currentHeight;
        if(i==h){
            currentHeight = 0;
        }else{
            currentHeight = heights[i];
        } 
        while(!st.isEmpty() && currentHeight < heights[st.peek()]){
            int index = st.pop();
            int height = heights[index];
            int width = st.isEmpty()?i:i-st.peek()-1;
            int area = height*width;
            maxarea = Math.max(area, maxarea);

        }
        st.push(i);
     }return maxarea;
    }
}
