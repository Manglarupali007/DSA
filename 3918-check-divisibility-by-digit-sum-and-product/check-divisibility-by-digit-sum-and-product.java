class Solution {
    public boolean checkDivisibility(int n) {
        int sum=0;
        int pro=1;
        int org=n;
        while(n>0){
            int last=n%10;
            sum+=last;
            pro*=last;
            n/=10;
        }
       return org % (sum + pro) == 0;
    }
}