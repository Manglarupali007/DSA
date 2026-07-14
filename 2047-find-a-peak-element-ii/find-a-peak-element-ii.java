class Solution {
    static int maxele (int mat[][], int mid){
        int n=mat.length;
        int m=mat[0].length;
        int max=-1;
        int index=-1;
        for(int i=0;i<n;i++){
            if(max<mat[i][mid]){
                max=mat[i][mid];
                index=i;
            }
        }
        return index;
    }
    public int[] findPeakGrid(int[][] mat) {
        int n=mat.length;
        int m=mat[0].length;
        int low=0;
        int high=m-1;
        while(low<=high){
            int mid=(high+low)/2;
            int row=maxele(mat,mid);
             int left=-1;
             int right=-1;
            if(mid-1>=0){
                left=mat[row][mid-1];
            }
            if(mid+1<m){
                 right=mat[row][mid+1];
            }
            if(mat[row][mid]>left && mat[row][mid]>right){
                return new int[]{row,mid};
            }
            else if(mat[row][mid]>left) {
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return new int[] {-1,-1};
    }
}