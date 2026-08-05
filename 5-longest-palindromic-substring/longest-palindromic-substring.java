class Solution {
    int max=Integer.MIN_VALUE;
    int start=0;
    public void expand(String s, int left, int right){
        int n=s.length();
        while(left>=0 && right<n && s.charAt(left)==s.charAt(right)){
            if(right-left+1 > max){
                max=right-left+1;
                start=left;
            }
            left--;
            right++;
        }
    }
    public String longestPalindrome(String s) {
        int n=s.length();
        for(int i=0;i<n;i++){
            expand(s,i,i);
            expand(s,i,i+1);
        }
    return s.substring(start,start+max);
    }
}