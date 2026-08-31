class Solution {
    public boolean isAnagram(String s, String t) {
        int n=s.length();
        int m=t.length();
        if(n!=m) return false;
        char [] srr=s.toCharArray();
        char [] trr=t.toCharArray();
        Arrays.sort(srr);
        Arrays.sort(trr);
        return Arrays.equals(srr,trr);
    }
}