class Solution {
    public int sumSubarrayMins(int[] arr) {
        int n=arr.length;
        long ans=0;
        long left, right;
        Stack<Integer> st=new Stack<>(); //to store index
        for(int i=0;i<=n;i++){
            while(!st.isEmpty() && (i==n || arr[st.peek()]>arr[i])){
                int mid=st.pop();
                if(st.isEmpty()) left=-1;
                else left=st.peek();
                right=i;
            long leftcount=mid-left;
            long rightcount=right-mid;
            ans+=arr[mid]*leftcount*rightcount;
            }
            if(i<n) st.push(i);
        }
        return (int)(ans % 1000000007);
    }
}