class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set <Character> set= new HashSet<>();
        int left=0, right=0;
        int max=0;
        int n=s.length();
        while(right<n){
            char ch=s.charAt(right);
            if(!set.contains(ch)){
                set.add(ch);
                max=Math.max(max,right-left+1);
                right++;
            }
            else{
                char chr=s.charAt(left);
                set.remove(chr);
                left++;
            }
        }
        return max;
    }
}