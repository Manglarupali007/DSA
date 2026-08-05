class Solution {
    int count=0;
    public void expand(String s, int left, int right){
         int n=s.length();
        while(left>=0 && right<n && s.charAt(left)==s.charAt(right)){
            count++;
            left--;
            right++;
        }
    }
    public int countSubstrings(String s) {
        int n=s.length();
        for(int i=0;i<n;i++){
            expand(s,i,i);
            expand(s,i,i+1);
        }
        return count;
    }
}