class Solution {
    public String frequencySort(String s) {
        int n=s.length();
        int[] freq=new int[128];
        for(char ch:s.toCharArray()){
            freq[ch]++;
        }
        char ch[]=new char[n];
        int idx=0;
        while(idx<n){
            int maxfreq=0;
            char maxchar=0;
            for(int i=0;i<128;i++){
                if(freq[i]>maxfreq){
                    maxfreq=freq[i];
                    maxchar=(char)i;
                }
            }
            while(maxfreq-->0){
                ch[idx++]=maxchar;
            }
            freq[maxchar]=0;
        }
        return new String(ch);
    }
}