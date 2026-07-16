class Solution {
    public boolean rotateString(String s, String goal) {
        int a=s.length();
        int b=goal.length();
        if(a!=b) return false;
        String temp=s+s;
        if(temp.contains(goal)) return true;
        return false;
    }
}