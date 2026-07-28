class Solution {
    public String smallestPalindrome(String s) {
       int n=s.length();
        char half[]=s.substring(0,n/2).toCharArray();
        Arrays.sort(half);
        String left=new String(half);
        String right=new StringBuilder(left).reverse().toString();
        if(n%2==0) return left+right;
        else return left+s.charAt(n/2)+right;
    }
}