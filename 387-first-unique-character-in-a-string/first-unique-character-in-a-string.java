class Solution {
    public int firstUniqChar(String s) {
        int frq[]=new int[26];
        int n=s.length();
        for(int i=0;i<n;i++){
            frq[s.charAt(i)-'a']++;
        }
        for(int i=0;i<n;i++){
            if(frq[s.charAt(i)-'a']==1) return i;
        }
        return -1;
    }
}