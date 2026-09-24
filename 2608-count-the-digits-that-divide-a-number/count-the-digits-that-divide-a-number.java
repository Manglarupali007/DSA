class Solution {
    public int countDigits(int num) {
        int org=num;
        int count=0;
        while(num>0){
            int last=num%10;
            if(org%last==0) count++;
            num/=10;
        }
        return count;
    }
}