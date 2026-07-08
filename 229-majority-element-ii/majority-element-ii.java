class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int count1=0, count2=0;
        int ele1=0, ele2=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(count1==0 && nums[i]!=ele2){
                count1=1;
                ele1=nums[i];
            }
            else if(count2==0 && nums[i]!=ele1){
                count2=1;
                ele2=nums[i];
            }
           else if(nums[i]==ele1) count1++;
            else if(nums[i]==ele2) count2++;
            else {
                count1--;
                count2--;
        }
        }
        List <Integer> ans= new ArrayList<>();
        int counta=0;
        int countb=0;
        for(int i=0;i<n;i++){
            if(nums[i]==ele1) counta++;
            else if(nums[i]==ele2) countb++;
        }
        if(counta>n/3) ans.add(ele1);
        if(countb>n/3) ans.add(ele2);
        return ans;
    }
}