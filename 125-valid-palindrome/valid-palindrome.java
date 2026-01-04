class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        s=s.replaceAll("[^a-z0-9]","");
        // int n=s.length();
        // int i=0, j=n-1;
        // while(i<=j){
        //     if(s.charAt(i)!=s.charAt(j)){
        //         return false;
        //     }
        //     i++;
        //     j--;
        // }
        // return true;

        StringBuilder sb=new StringBuilder(s);
        String rev=sb.reverse().toString();
        if(s.equals(rev)){
            return true;
        }
        return false;
    }
}