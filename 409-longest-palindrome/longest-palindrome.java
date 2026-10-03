class Solution {
    public int longestPalindrome(String s) {
        int freq[]=new int[256];
        int n=s.length();
        for(char c:s.toCharArray()){
            freq[c]++;
        }
        int count=0;
        boolean odd=false;
        for(int i=0;i<freq.length;i++){
            if(freq[i]%2==0) count+=freq[i];
            else{
                count+=freq[i]-1;
                odd=true;
            }
        }
            if(odd) count++;
        return count;
    }
}