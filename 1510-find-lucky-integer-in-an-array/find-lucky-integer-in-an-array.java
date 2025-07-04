class Solution {
    public int findLucky(int[] arr) {
        int lucky = -1;
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == arr[i]) {
                    count++;
                }
            }
            if (count == arr[i]) {
                lucky = Math.max(lucky, arr[i]);
            }
        }
        return lucky;
    }
}