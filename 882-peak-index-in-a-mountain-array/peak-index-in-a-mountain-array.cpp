class Solution {
public:
    int peakIndexInMountainArray(vector<int>& arr) {
        int n=arr.size();
             int start=0;
             int end=n-1;
             while(start<end){
                // int mid=start+(end-start)/2;
                int mid=(start+end)/2;
                if(arr[mid]<arr[mid+1]){
                    start=mid+1;
                }
                else{
                    end=mid;
                }
                // mid=start+(end-start)/2;
                  mid=(start+end)/2;
             }
             return start;
    }

};