class Solution {
    public int characterReplacement(String s, int k) {
        int n=s.length();
        int low=0;
        int high=0;
        int max=0;
        int ans=0;
        HashMap<Character,Integer> map=new HashMap<>();
        while(high<n){
            char ch=s.charAt(high);
            map.put(ch,map.getOrDefault(ch,0)+1);
            ans=Math.max(ans,map.get(ch));
            while((high-low+1) - ans > k){
                char left=s.charAt(low);
                map.put(left,map.get(left)-1);
                low++;
            }
            max=Math.max(max,high-low+1);
            high++;
        }
        return max;
    }
}