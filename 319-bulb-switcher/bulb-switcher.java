class Solution {
    public int bulbSwitch(int n) {
        int i=0;
        int j=1;
        if(n==0){
            return 0;
        }
        else if(n<=3){
            return j;
        }
        while(i<n){
            i+=2*j+1;
            if(i<n){
                j++;
            }
        }
        return j;
    }
}