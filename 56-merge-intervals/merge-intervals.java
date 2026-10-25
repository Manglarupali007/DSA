class Solution {
    public int[][] merge(int[][] intervals) {
       int n=intervals.length;
       List<int[]> ans=new ArrayList<>();
       Arrays.sort(intervals,(a,b) -> a[0]-b[0]);
       int start=intervals[0][0];
       int end=intervals[0][1];
       for(int i=1;i<n;i++){
        if(intervals[i][0] <= end){
            end=Math.max(intervals[i][1],end);
        }
        else{
            ans.add(new int[]{start,end});
            start=intervals[i][0];
            end=intervals[i][1];
        }
       } 
        ans.add(new int[]{start,end});
       int[][] res= new int[ans.size()][];
       for(int i=0;i<ans.size();i++){
        res[i]=ans.get(i);
       }
       return res;
    }
}