class Solution {
    public static void sort(int arr[], int l, int r){
        if(l>=r){
            return;
        }
        int mid=(l+r)/2;
        sort(arr, l, mid);
        sort(arr, mid+1, r);
        merge(arr, l, mid, r);
    }
    public static void merge(int arr[], int l, int m, int r){
        int [] temp= new int [r-l+1];
        int i=l, j=m+1, k=0;
        while(i<=m && j<=r){
            if(arr[i]<=arr[j]){
                temp[k++]=arr[i++];
            }
            else{
                temp[k++]=arr[j++];
            }
        }
        while(i<=m){
             temp[k++]=arr[i++];
        }
        while(j<=r){
             temp[k++]=arr[j++];
        }
        for(int p=0; p<temp.length; p++){
            arr[l+p]=temp[p];
        }
    }
    public int[] sortArray(int[] nums) {
        sort(nums, 0, nums.length-1);
        return nums;
    }
}