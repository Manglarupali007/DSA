class Solution {
    public int get(int n){
        int dig=0;
        while(n>0){
int rem=n%10;
dig+=rem*rem;
n/=10;
        }
        return dig;
    }
    public boolean isHappy(int n) {
        int slow=n;
        int fast=get(n);
        while(fast!=1 && fast!=slow){
            slow=get(slow);
            fast=get(get(fast));
        }
        return fast==1;
    }
}