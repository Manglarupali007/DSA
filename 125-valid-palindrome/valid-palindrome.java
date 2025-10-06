class Solution {
    public boolean isPalindrome(String s) {
            s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        
              StringBuilder str = new StringBuilder(s);
            String rev=str.reverse().toString();
            if(rev.equals(s)){
                return true;
            }
            return false;
    }
}