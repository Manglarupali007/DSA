class Solution {
    public boolean isPalindrome(String s) {
s=s.toLowerCase().replaceAll("[^a-z0-9]","");
if(s.length()==0) return true;
StringBuilder sb=new StringBuilder(s);
return sb.reverse().toString().equals(s);
}
}