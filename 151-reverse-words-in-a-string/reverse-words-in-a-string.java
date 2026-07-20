class Solution {
    public String reverseWords(String s) {
        String arr[]=s.split("\\s+");
        StringBuilder ans = new StringBuilder();
        // String ans="";
        int n=arr.length;
        for(int i=n-1;i>=0;i--){
            ans.append(arr[i]+" ");
        }
        return ans.toString().trim();
    }
}