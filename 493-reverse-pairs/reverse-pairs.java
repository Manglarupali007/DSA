class Solution {
    public void merge(int[]nums, int low, int mid, int high){
        int[] temp=new int[high-low+1];
        int left=low;
        int right=mid+1;
        int k=0;
        while(left<=mid && right<=high){
            if(nums[left]<=nums[right]){
                temp[k++]=nums[left++];
            }
            else{
              temp[k++]=nums[right++];  
            }
        }
        while(left<=mid){
            temp[k++]=nums[left++];
        }
        while(right<=high){
            temp[k++]=nums[right++]; 
        }
        int j=0;
        for(int i=low;i<=high;i++){
            nums[i]=temp[j++];
        }
    }
    public int mergeSort(int nums[], int low, int high){
        if(low >= high){
    return 0;
}
        int mid=(high+low)/2;
        int count=0;
        count+=mergeSort(nums,low,mid);
        count+=mergeSort(nums,mid+1, high);
        count+=countpairs(nums,low,mid,high);
        merge(nums,low,mid,high);
        return count;
    }
    public int countpairs(int nums[], int low, int mid, int high){
        int right=mid+1;
        int count=0;
        for(int i=low;i<=mid;i++){
            while (right <= high && (long) nums[i] > 2L * nums[right]) {
    right++;
}
            count+=right-(mid+1);
        }
        return count;
    }
    public int reversePairs(int[] nums) {
       return mergeSort(nums, 0, nums.length-1); 
    }
}