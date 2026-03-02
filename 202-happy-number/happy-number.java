class Solution {
    public boolean isHappy(int n) {
        HashSet <Integer> hash=new HashSet<>();
        while(n!=1 && hash.add(n)){
            int sum=0;
            while(n>0){
                int r=n%10;
                sum+=r*r;
                n/=10;
            }
            n=sum;
        }
        return n==1;
    }
}