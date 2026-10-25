class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int n=intervals.length;
        List<int[]> ans=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(intervals[i][1]<newInterval[0])
            ans.add(intervals[i]);
             else if(intervals[i][0]>newInterval[1]){
                ans.add(newInterval);
                newInterval=intervals[i];
             }
             else{
                newInterval[0]=Math.min(intervals[i][0],newInterval[0]);
                newInterval[1]=Math.max(intervals[i][1], newInterval[1]);
             }
        }
        ans.add(newInterval);
        int res[][]=new int[ans.size()][];
        for(int i=0;i<ans.size();i++){
            res[i]=ans.get(i);
        }
        return res;
    }
}