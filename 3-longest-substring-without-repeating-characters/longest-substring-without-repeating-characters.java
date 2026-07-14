class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int ans = Integer.MIN_VALUE;
        int i=0,j=0;
        if(n==0){
            return 0;
        }
        HashSet<Character> set = new HashSet<>();
        while(j<n){
            char ch = s.charAt(j);
            if(!set.contains(ch)){
                set.add(ch);
                ans = Math.max(ans,j-i+1);
                j++;
            } else{
                set.remove(s.charAt(i));
                i++;
            }
        }
        return ans;
    }
}