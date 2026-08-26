class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int n=nums1.length;
        int m=nums2.length;
        for(int i=0;i<n;i++){
            map.put(nums1[i],map.getOrDefault(nums1[i],0)+1);
        }
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0;i<m;i++){
            if(map.containsKey(nums2[i]) && map.get(nums2[i])>0){
                arr.add(nums2[i]);
                map.put(nums2[i],map.get(nums2[i])-1);
            }
        }
        int [] ans=new int[arr.size()];
        for(int i=0;i<arr.size();i++){
            ans[i]=arr.get(i);
        }
        return ans;
    }
}