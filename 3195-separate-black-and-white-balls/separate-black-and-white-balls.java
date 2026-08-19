class Solution {
    public long minimumSteps(String s) {
        int n=s.length();
        long count=0;
        int zero=0;
        for(int i=n-1;i>=0;i--){
            if(s.charAt(i)=='0') zero++;
            else count+=zero;
        }
        return count;
    }
}