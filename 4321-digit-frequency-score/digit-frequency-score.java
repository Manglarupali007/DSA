class Solution {
    public int digitFrequencyScore(int n) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int temp=n;
        while(temp>0){
            int last=temp%10;
            map.put(last,map.getOrDefault(last,0)+1);
temp/=10;
        }
        int result=0;
           for(int digit : map.keySet()) {
            result += digit * map.get(digit);
        }
        return result;
    }
}