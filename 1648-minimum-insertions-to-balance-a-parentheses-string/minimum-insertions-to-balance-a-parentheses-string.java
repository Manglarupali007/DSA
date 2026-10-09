class Solution {
    public int minInsertions(String s) {
        int open = 0;
        int insert = 0;
        char[] arr = s.toCharArray();
        for(int i = 0;i < arr.length;i++){
            char ch = arr[i];
            if(ch == '('){
                open++;
            }
            else{
                if(i+1 < arr.length && arr[i+1] == ')'){
                    i++;
                }
                else{
                    insert++;
                }

                if(open > 0) open--;
                else insert++;
            }
        }
        return insert + open*2;
    }
}