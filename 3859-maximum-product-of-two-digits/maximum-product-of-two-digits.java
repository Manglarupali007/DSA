class Solution {
    public int maxProduct(int n) {
        ArrayList<Integer> arr=new ArrayList<>();
        while(n>0){
            int rem=n%10;
            arr.add(rem);
            n/=10;
        }
        Collections.sort(arr);
        int s=arr.size();
        return arr.get(s-1) * arr.get(s-2);
    }
}