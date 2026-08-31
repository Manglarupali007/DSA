class Solution {
    public int lengthOfLongestSubstring(String s) {
        // int [] freq=new int[256];
        // int n=s.length();
        // int left=0;
        // int max=0;
        // for(int right=0;right<n;right++){
        //     while(freq[s.charAt(right)]>0){
        //         freq[s.charAt(left)]--;
        //         left++;
        //     }
        //     freq[s.charAt(right)]++;
        //     max=Math.max(max,right-left+1);
        // }
        // return max;

        int [] freq=new int[256];
        int n=s.length();
        int low=0;
        int max=0;
        int high=0;
        while(high<n){
            while(freq[s.charAt(high)]>0){
                freq[s.charAt(low)]--;
                low++;
            }
              freq[s.charAt(high)]++;
            max=Math.max(max,high-low+1);
            high++;
        }
        return max;
    }
}