class Solution {
    public int countOdds(int low, int high) {
        // int count=0;
        // for(int i=low;i<=high;i++){
        //     if(low%2!=0){
        //         count++;
        //     }
        // }
        // return count;

if(low%2==0){
low++;
}
if(high%2==0){
    high--;
}
        return (high-low)/2 + 1;
    }
}