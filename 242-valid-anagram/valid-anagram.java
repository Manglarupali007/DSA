class Solution {
    public boolean isAnagram(String s, String t) {
        char[]srr=s.toCharArray();
          char[]trr=t.toCharArray();
        Arrays.sort(srr);
        Arrays.sort(trr);
        return Arrays.equals(srr,trr);
    }
}