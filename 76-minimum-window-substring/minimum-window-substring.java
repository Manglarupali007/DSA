class Solution {
    public String minWindow(String s, String t) {
        int n=s.length();
        int m=t.length();
        int trr[]=new int[256];
        for(int i=0;i<m;i++){
            trr[t.charAt(i)]++;
        }
        if(n<m) return "";
        int low=0;
        int high=0;
        int min=Integer.MAX_VALUE;
        int need=m;
        int start=0;
        while(high<n){
            char c=s.charAt(high);
            if(trr[c]>0) need--;
            trr[c]--;
            high++;
            while(need==0){
                if(high-low<min){
                    min=high-low;
                    start=low;
                }
                char left=s.charAt(low);
                trr[left]++;
                if(trr[left]>0) need++;
                low++;
            }
        }
        if(min==Integer.MAX_VALUE) return "";
        return s.substring(start,start+min);
    }
}