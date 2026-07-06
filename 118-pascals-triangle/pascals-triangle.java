class Solution {
    public List<List<Integer>> generate(int numRows) {
            List<List<Integer>> ans = new ArrayList<>(); // add every row to this
            for(int i=0;i<numRows;i++){
                     List<Integer> temp = new ArrayList<>(); //for every row 
                     long res=1;
                     temp.add(1);
                     for(int j=0;j<i;j++){
                        res*=(i-j);
                        res/=(j+1);
                        temp.add((int)res);
                     }
                     ans.add(temp);
            }
            return ans;
    }
}