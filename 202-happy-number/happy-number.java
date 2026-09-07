class Solution {
    public int get(int n){
        if(n==0)return 0;
        int sum=0;
        while(n>0){
            int dig=n%10;
            sum+=dig*dig;
            n/=10;
        }
        return sum;
    }
    public boolean isHappy(int n) {
        int slow=n;
        int fast=get(n);
        while(fast!= 1 && slow!=fast){
            slow=get(slow);
            fast=get(get(fast));
        }
        return fast==1;
    }
}