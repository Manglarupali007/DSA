class Solution {
    public char repeatedCharacter(String s) {
        int n=s.length();
        for(int i=1;i<n;i++){
            for(int j=0;j<i;j++){
                if(s.charAt(i)==s.charAt(j)) return s.charAt(j);
            }
        }
        return ' ';
    }
}