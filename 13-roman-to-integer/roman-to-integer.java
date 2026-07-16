class Solution {
    public int value(char c){
        if(c=='I') return 1;
        if(c=='V') return 5;
        if(c=='X') return 10;
        if(c=='L') return 50;
        if(c=='C') return 100;
        if(c=='D') return 500;
        return 1000;
     }
    public int romanToInt(String s) {
        int sum=0;
        int n=s.length();
        for(int i=0;i<n;i++){
            int curr=value(s.charAt(i));
            if(i<n-1){
                int next=value(s.charAt(i+1));
                if(curr<next) sum-=curr;
                else sum+=curr;
            }
            else sum+=curr;
        }
        return sum;
    }
}